DESCRIPTION = "LXDE Panel"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

PR = "r0"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=9d19a9495cc76dc96b703fb4aa157183"

RDEPENDS_{PN} = "gtk+ menu-cache lxmenu-data libxmu libxpm alsa-lib"
DEPENDS = "${RDEPENDS}"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.gz \
           file://lxpanel-0.5.6-broken-apps.patch \
"
SRC_URI[md5sum] = "30def9a0aa3c517e102295e8a7bc17fd"
SRC_URI[sha256sum] = "11cfe76f6241bbac556e57a6efc079b6e10dceea76a8bdaf4c749afdb81d15ab"

inherit autotools gettext pkgconfig

EXTRA_OECONF += "--enable-alsa --with-x --with-plugins=all"

FILES_${PN}-dbg += "${libdir}/lxpanel/plugins/.debug"
