DESCRIPTION = "LXDE Panel"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

PR = "r0"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=9d19a9495cc76dc96b703fb4aa157183"

DEPENDS = "gtk+ menu-cache lxmenu-data libxmu libxpm alsa-lib libwnck wireless-tools pcmanfm libxml2 keybinder"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.xz \
           file://lxpanel-broken-apps.patch \
"
SRC_URI[md5sum] = "aa5bc73f4fe1d8006248a1f45f0a8a21"
SRC_URI[sha256sum] = "94dd664ed6c7c001ca83959cdeadaa386ba0d2c91f113c2e6d318a5f33604415"

inherit autotools gettext pkgconfig

EXTRA_OECONF += "--enable-alsa --with-x --with-plugins=all"

FILES_${PN}-dbg += "${libdir}/lxpanel/plugins/.debug"
FILES_${PN}-dev += "${libdir}/lxpanel/*.so"
