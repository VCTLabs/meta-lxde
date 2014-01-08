DESCRIPTION = "LXDE menu cache"
HOMEPAGE = "http://lxde.sourceforge.net/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

RDEPENDS_{PN} = "glib-2.0"
DEPENDS = "glib-2.0 intltool-native"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fd296c317a235782fbbd37b6f54bc985"
SRC_URI[sha256sum] = "08e658021faecd4eefb26cc21b207251a6b4e844e131cec491471aba9eaea122"

FILES_${PN}-dbg += "${libdir}/menu-cache/menu-cache/.debug"

inherit autotools gettext pkgconfig
