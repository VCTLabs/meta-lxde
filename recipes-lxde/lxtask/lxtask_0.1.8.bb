SUMMARY = "LXDE task manager"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "glib-2.0 glib-2.0-native intltool-native virtual/libintl"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxtask-${PV}.tar.xz"
SRC_URI[md5sum] = "dd4f423dda192cb50618c6b1e76ec6b7"
SRC_URI[sha256sum] = "dfb443805f72857b5ad711d4bb862a9cd3db0cd2df16d0c24f23ed679b0bef40"

PACKAGECONFIG ?= "gtk3"
PACKAGECONFIG[gtk3] = "--enable-gtk3,,gtk+3"
python __anonymous () {
    depends = d.getVar("DEPENDS", d, 1)
    if 'gtk3' not in d.getVar('PACKAGECONFIG', True):
        d.setVar("DEPENDS", "%s gtk+" % depends)
}

inherit autotools pkgconfig gettext
