SUMMARY = "LXDE GTK+ theme switcher"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "glib-2.0-native intltool-native"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${P}.tar.xz"
SRC_URI[md5sum] = "f10345313e2c12bad51c1b58bd46b454"
SRC_URI[sha256sum] = "7222d858b8fef4b7967c42142d61e82ded6dd42dc5ef1d59caad775795928b38"

PACKAGECONFIG ?= "gtk3"
PACKAGECONFIG[gtk3] = "--enable-gtk3,,gtk+3"
python __anonymous () {
    depends = d.getVar("DEPENDS", d, 1)
    if 'gtk3' not in d.getVar('PACKAGECONFIG', True):
        d.setVar("DEPENDS", "%s gtk+" % depends)
}

inherit autotools gettext pkgconfig

fakeroot do_fixup_ownership () {
    find ${WORKDIR}/package/usr/src -exec chown 0:0 {} \;
}

addtask do_fixup_ownership after do_package before do_packagedata
