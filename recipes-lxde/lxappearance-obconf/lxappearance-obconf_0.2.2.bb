SUMMARY = "LXDE Appearance Obconfig"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"
PR = "r1"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "menu-cache lxappearance"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.xz"
SRC_URI[md5sum] = "d958ac5514ba1707429ff6794ab59abf"
SRC_URI[sha256sum] = "596a04078529b8ef594253bc8628feae97629f2e04f10e3ded5b84ff5706380b"

inherit autotools gettext pkgconfig

FILES_${PN} += "${datadir}/lxappearance/obconf/obconf.glade \
	${libdir}/lxappearance/plugins/obconf.so"
FILES_${PN}-dbg += "${libdir}/lxappearance/plugins/.debug/obconf.so"
FILES_${PN}-dev += "${libdir}/lxappearance/plugins/obconf.la "
FILES_${PN}-staticdev += "${libdir}/lxappearance/plugins/obconf.a "
