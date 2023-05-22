SUMMARY = "LXHotkey is a hotkeys management utility"
HOMEPAGE = "https://wiki.lxde.org/en/LXHotkey"
SECTION = "x11"

LICENSE = "GPL-2.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=4641e94ec96f98fabc56ff9cc48be14b"

DEPENDS = "libexif libfm glib-2.0 glib-2.0-native intltool-native virtual/libintl"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxhotkey-${PV}.tar.xz"
SRC_URI[md5sum] = "7851d4fc375a1dae8df4c87021eba455"
SRC_URI[sha256sum] = "35dd6c75790e3a986fbb931c12838b3a554ad23597dd3878de8d6f49c3129748"

PACKAGECONFIG ?= "gtk3"
PACKAGECONFIG[gtk3] = "--with-gtk=3,,gtk+3"
PACKAGECONFIG[gtk2] = "--with-gtk=2,,gtk+"

inherit autotools pkgconfig gettext
