SUMMARY = "LXDE keyboard and mouse configuration tool"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "virtual/libintl intltool-native glib-2.0 gtk+"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${P}.tar.xz"
SRC_URI[md5sum] = "5deb8b5cffb8e385622051e4a7b103d0"
SRC_URI[sha256sum] = "6e37074e406a05792f6eaac029638bd02fe88926f20736d73dcb5113da825c24"

inherit autotools gettext pkgconfig
