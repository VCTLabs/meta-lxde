SUMMARY = "LXDE task manager"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

PR = "r1"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "virtual/libintl intltool-native gtk+ glib-2.0"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.xz"
SRC_URI[md5sum] = "14b5341822aaa049f2d4d5a56c1b28f2"
SRC_URI[sha256sum] = "f78d6a9953dfbedfa00f69b3e908e326398cd40f541bc8a6a08f5f0a06894345"

inherit autotools pkgconfig gettext
