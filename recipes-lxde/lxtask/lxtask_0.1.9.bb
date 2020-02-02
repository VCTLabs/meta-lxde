SUMMARY = "LXDE task manager"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "glib-2.0 glib-2.0-native intltool-native virtual/libintl"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxtask-${PV}.tar.xz"
SRC_URI[md5sum] = "f19a9e4d22a075f984681a480f0aa886"
SRC_URI[sha256sum] = "41ea88f0adf31a840e4b9d137ca5ea802860d1a117845ba25f3080d74a876433"

PACKAGECONFIG ?= "gtk3"
PACKAGECONFIG[gtk3] = "--enable-gtk3,,gtk+3"
python __anonymous () {
    depends = d.getVar("DEPENDS", d, 1)
    if 'gtk3' not in d.getVar('PACKAGECONFIG', True):
        d.setVar("DEPENDS", "%s gtk+" % depends)
}

inherit autotools pkgconfig gettext
