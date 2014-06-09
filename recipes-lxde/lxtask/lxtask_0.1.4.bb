DESCRIPTION = "LXDE task manager"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

PR = "r1"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = "virtual/libintl intltool-native gtk+ glib-2.0"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.gz"
SRC_URI += "file://lxtask-963dea395cc58eae940b85e242f0d84fb7d2eaa5.patch"
SRC_URI[md5sum] = "c4ab47d03d41a88696d64d3f1e78cf7f"
SRC_URI[sha256sum] = "39110c99e9e56101e25be35628abafd81b1e3ea47e2d8bea45b2cb12c1e3cd61"

inherit autotools pkgconfig gettext
