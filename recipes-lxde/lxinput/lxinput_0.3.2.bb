DESCRIPTION = "LXDE keyboard and mouse configuration tool"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS = "virtual/libintl intltool-native glib-2.0 gtk+"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${P}.tar.gz"
SRC_URI[md5sum] = "5bf563d04984ef2a147433f3bdda687b"
SRC_URI[sha256sum] = "481622f9f73c7d622a712df55d509a18805758ee002cbbc36efbd73bedd8205f"

inherit autotools gettext pkgconfig
