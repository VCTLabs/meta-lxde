DESCRIPTION = "LXDE GTK+ theme switcher"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

PR = "r2"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "gtk+"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${P}.tar.gz \
           file://empty-cursor.patch \
           file://lxappearance_missing_am_prog_cc_c_o.patch \
"
SRC_URI[md5sum] = "a088c6ef08fd25df7dc3be5b07168bbe"
SRC_URI[sha256sum] = "a446aaad5572dd42845d41a20db76ca1fb1b93e3827db1bce243c9877e5996f4"

inherit autotools gettext pkgconfig
