SUMMARY = "LXDE Panel"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=9d19a9495cc76dc96b703fb4aa157183"

DEPENDS = "gtk+ menu-cache lxmenu-data libxmu libxpm alsa-lib libwnck wireless-tools pcmanfm libxml2 keybinder"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxpanel-${PV}.tar.xz \
           file://lxpanel-broken-apps.patch \
"
SRC_URI[md5sum] = "6ea8dea8dc6c781b7adfbccbcd59c512"
SRC_URI[sha256sum] = "c657eb049a0f59e7b2d1ad6cb621c272833b765705c19089e48b3c248351b1e0"

inherit autotools gettext pkgconfig

EXTRA_OECONF += "--enable-alsa --with-x --with-plugins=all"

FILES_${PN}-dbg += "${libdir}/lxpanel/plugins/.debug"
FILES_${PN}-dev += "${libdir}/lxpanel/*.so"
