DESCRIPTION = "LXDE Panel"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

PR = "r0"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=9d19a9495cc76dc96b703fb4aa157183"

RDEPENDS_{PN} = "gtk+ menu-cache lxmenu-data libxmu libxpm alsa-lib libwnck wireless-tools"
DEPENDS = "gtk+ menu-cache lxmenu-data libxmu libxpm alsa-lib libwnck wireless-tools"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.gz \
           file://lxpanel-broken-apps.patch \
"
SRC_URI[md5sum] = "e96e191c4ffb7b475a6ba06455ecf7fa"
SRC_URI[sha256sum] = "a16a21b2186218c70ed98dc7875c54d6bb12ae7271825ff5060feb8d2a4e86cb"

inherit autotools gettext pkgconfig

EXTRA_OECONF += "--enable-alsa --with-x --with-plugins=all"

FILES_${PN}-dbg += "${libdir}/lxpanel/plugins/.debug"
