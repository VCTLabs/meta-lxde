SUMMARY = "LXDE GTK+ theme switcher"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

PR = "r2"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "gtk+"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${P}.tar.xz"
SRC_URI[md5sum] = "79740125628a8374c1101cf26e558fa5"
SRC_URI[sha256sum] = "09e38aff39708f089cd2f421d97f99c3b11f03f88979b922dd42362956d816de"

inherit autotools gettext pkgconfig
