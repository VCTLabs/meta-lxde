DESCRIPTION="nuoveXT2 iconset"
HOMEPAGE="http://lxde.sf.net/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6a6a8e020838b23406c81b19c1d46df6"

DEPENDS = "gtk+"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "346e1aecf805892b106b4d4b0f26e5cc"
SRC_URI[sha256sum] = "49dc61c46c4a0ca9298f9e0866bcf7212a08ddaa71f15bfabfb0220fe1efa848"

inherit autotools gettext pkgconfig

FILES_${PN} += "${datadir}/icons"
