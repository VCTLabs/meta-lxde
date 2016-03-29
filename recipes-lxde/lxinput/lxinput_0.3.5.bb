SUMMARY = "LXDE keyboard and mouse configuration tool"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "virtual/libintl intltool-native glib-2.0 gtk+"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${P}.tar.xz"
SRC_URI[md5sum] = "69680debaef053d540ae3a5f4b237150"
SRC_URI[sha256sum] = "4e8f778a65a4afe2365b47e7899358aa4fab535343aa62c72a3cdc4cac1f6e88"

inherit autotools-brokensep gettext pkgconfig
