SUMMARY = "Image with the LXDE desktop environment"
export IMAGE_BASENAME = "core-image-lxde"

LICENSE = "MIT"

# Most LXDE components don't even compile without native X11 support,
# (gdk-x11), so make this fail early if x11 is provided by XWAYLAND.
inherit features_check
REQUIRED_DISTRO_FEATURES = "x11"
CONFLICT_DISTRO_FEATURES = "wayland"

SYSTEMD_DEFAULT_TARGET = "graphical.target"

IMAGE_LINGUAS = " "

IMAGE_INSTALL += " \
    packagegroup-core-boot \
    packagegroup-core-x11 \
    packagegroup-lxde-extended \
    kernel-modules \
    \
    lxdm \
    \
    openbox \
    openbox-theme-clearlooks \
    openbox-theme-onyx \
    obconf \
    hicolor-icon-theme \
"

IMAGE_DEV_MANAGER   = "udev"
IMAGE_INIT_MANAGER  = "systemd"
IMAGE_INITSCRIPTS   = " "
IMAGE_LOGIN_MANAGER = "busybox shadow"

inherit core-image
