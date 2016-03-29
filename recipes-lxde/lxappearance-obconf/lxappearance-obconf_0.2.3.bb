SUMMARY = "LXDE Appearance Obconfig"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "intltool-native menu-cache lxappearance"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxappearance-obconf-${PV}.tar.xz"
SRC_URI[md5sum] = "ae0076d489aa786f5d573f7ff592a4ab"
SRC_URI[sha256sum] = "3150b33b4b7beb71c1803aee2be21c94767d73b70dfc8d2bcaafe2650ea83149"

inherit autotools gettext pkgconfig

FILES_${PN} += "${datadir}/lxappearance/obconf/obconf.glade \
	${libdir}/lxappearance/plugins/obconf.so"
FILES_${PN}-dbg += "${libdir}/lxappearance/plugins/.debug/obconf.so"
FILES_${PN}-dev += "${libdir}/lxappearance/plugins/obconf.la "
FILES_${PN}-staticdev += "${libdir}/lxappearance/plugins/obconf.a "

do_install_append () {
    find ${D} -exec ls -l {} \;
}