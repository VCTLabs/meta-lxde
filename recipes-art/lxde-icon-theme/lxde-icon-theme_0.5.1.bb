DESCRIPTION="nuoveXT2 iconset"
HOMEPAGE="http://lxde.sf.net/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=6a6a8e020838b23406c81b19c1d46df6"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.xz"
SRC_URI[md5sum] = "7467133275edbbcc79349379235d4411"
SRC_URI[sha256sum] = "e3d0b7399f28a360a3755171c9a08147d68f853f518be5485f5064675037916c"

inherit autotools-brokensep gettext pkgconfig

FILES_${PN} += "${datadir}/icons"
