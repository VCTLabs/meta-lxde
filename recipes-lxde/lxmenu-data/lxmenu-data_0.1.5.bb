SUMMARY = "Data files for application menu "
HOMEPAGE = "http://lxde.sourceforge.net/"
SECTION = "x11"

LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

DEPENDS = "intltool-native"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxmenu-data-${PV}.tar.xz  \
           file://lxmenu-replace_am_glib_gnu_gettext.patch \
"

SRC_URI[md5sum] = "cc1989444284a65dbc7047348a68d6d4"
SRC_URI[sha256sum] = "9fe3218d2ef50b91190162f4f923d6524c364849f87bcda8b4ed8eb59b80bab8"

inherit autotools gettext pkgconfig

FILES:${PN} += "${datadir}/desktop-directories/"

