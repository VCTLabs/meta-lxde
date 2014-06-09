DESCRIPTION = "LXDE Launcher"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"
PR = "r1"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "menu-cache gtk+"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "16df627447838b170a72cc3a9ee21497"
SRC_URI[sha256sum] = "ad586e3a2668f98bbf0217ec1be1f8f1be4ff876b180a407c7db2fe354303cbc"

FILES_${PN} += "${datadir}/desktop-directories/* "

inherit autotools gettext pkgconfig

