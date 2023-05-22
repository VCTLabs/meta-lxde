SUMMARY = "LXDE Appearance Obconfig"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "glib-2.0-native intltool-native libcroco librsvg lxappearance menu-cache openbox"

# patch only needed for gtk3, applied unconditionally though
SRC_URI  = " \
    ${SOURCEFORGE_MIRROR}/lxde/lxappearance-obconf-${PV}.tar.xz \
    file://window_border_broken_with_gtk3.patch \
"
SRC_URI[md5sum] = "ae0076d489aa786f5d573f7ff592a4ab"
SRC_URI[sha256sum] = "3150b33b4b7beb71c1803aee2be21c94767d73b70dfc8d2bcaafe2650ea83149"

PACKAGECONFIG ?= "gtk3"
PACKAGECONFIG[gtk3] = "--enable-gtk3,,gtk+3"
python __anonymous () {
    depends = d.getVar("DEPENDS", d, 1)
    if 'gtk3' not in d.getVar('PACKAGECONFIG', True):
        d.setVar("DEPENDS", "%s gtk+" % depends)
}

inherit autotools gettext pkgconfig

FILES:${PN} += "${datadir}/lxappearance/obconf/obconf.glade \
	${libdir}/lxappearance/plugins/obconf.so"
FILES:${PN}-dbg += "${libdir}/lxappearance/plugins/.debug/obconf.so"
FILES:${PN}-dev += "${libdir}/lxappearance/plugins/obconf.la "
FILES:${PN}-staticdev += "${libdir}/lxappearance/plugins/obconf.a "

do_install:append () {
    find ${D} -exec ls -l {} \;
}