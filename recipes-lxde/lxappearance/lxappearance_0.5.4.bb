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
SRC_URI[md5sum] = "c7b8c18368f757a8a60f21cb46d7d9b3"
SRC_URI[sha256sum] = "beffc2553084ad32ab7bb424b9440c606410ca584770910a1c6ce2f9812ce5e8"

inherit autotools gettext pkgconfig
