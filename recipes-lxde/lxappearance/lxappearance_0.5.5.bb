DESCRIPTION = "LXDE GTK+ theme switcher"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

PR = "r2"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "gtk+"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${P}.tar.xz \
           file://empty-cursor.patch \
"
SRC_URI[md5sum] = "a67113681d9d0a6d936289909aed5782"
SRC_URI[sha256sum] = "8cae82e6425ba8a0267774e4d10096df2d91b0597520058331684a5ece068b4c"

inherit autotools gettext pkgconfig
