DESCRIPTION = "LXDE menu cache"
HOMEPAGE = "http://lxde.sourceforge.net/"
SECTION = "x11"

LICENSE = "GPLv2 LGPLv2.1"
LIC_FILES_CHKSUM = "file://COPYING;md5=0964c689fcf4c21c6797ea87408416b6"

DEPENDS = "glib-2.0 intltool-native libfm-extra"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.xz"
SRC_URI[md5sum] = "4a8e6c1a86d5e64ec725d850a4abfbad"
SRC_URI[sha256sum] = "ff7df437bbfd3119c5f662c6d209b98f15de03a7203308c6b56a4c1e1d419aaf"

CFLAGS_prepend = "-I ${WORKDIR}/build/libmenu-cache "

FILES_${PN}-dbg += "${libdir}/menu-cache/menu-cache/.debug"

inherit autotools gettext pkgconfig gtk-doc
