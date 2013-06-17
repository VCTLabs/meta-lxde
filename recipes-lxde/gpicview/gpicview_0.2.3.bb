DESCRIPTION = "Simple Image Viewer for X"
HOMEPAGE = "http://lxde.sourceforge.net/gpicview"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

DEPENDS = "jpeg gtk+"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${P}.tar.gz"
SRC_URI[md5sum] = "bca9ffe1d283ed3dbb13bada7feb7e89"
SRC_URI[sha256sum] = "58dcdf9e1f29c38c9c5716215981c62c054282a765c57d9f7713232800f3bb99"

inherit autotools gettext pkgconfig
