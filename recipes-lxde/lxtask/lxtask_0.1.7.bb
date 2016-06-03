SUMMARY = "LXDE task manager"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "virtual/libintl intltool-native gtk+ glib-2.0"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxtask-${PV}.tar.xz"
SRC_URI[md5sum] = "eb2ad374e97c317e2f74d47b1e582303"
SRC_URI[sha256sum] = "f0b65a6b145856000383badafd14ab7944fd98e95c9efdc03474a5a7ff8630fe"

inherit autotools pkgconfig gettext