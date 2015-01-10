SUMMARY = "Data files for application menu "
HOMEPAGE = "http://lxde.sourceforge.net/"
SECTION = "x11"

LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

DEPENDS = "intltool-native"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxmenu-data-${PV}.tar.xz  \
           file://lxmenu-replace_am_glib_gnu_gettext.patch \
"

SRC_URI[md5sum] = "a44bb6214594fee21b8ef3e478b0f0e5"
SRC_URI[sha256sum] = "8802fbc88e4cac80dbf0a2926deb30eeb127c54b93254d7bda591cbe174bfb1c"

inherit autotools gettext pkgconfig

FILES_${PN} += "${datadir}/desktop-directories/"

