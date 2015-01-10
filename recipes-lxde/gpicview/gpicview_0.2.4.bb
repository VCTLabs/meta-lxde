SUMMARY = "Simple Image Viewer for X"
HOMEPAGE = "http://lxde.sourceforge.net/gpicview"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

DEPENDS = "jpeg gtk+"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${P}.tar.gz"
SRC_URI[md5sum] = "b209e36531f89c48e3067b389699d4c7"
SRC_URI[sha256sum] = "99beb7df6765b386cd3f65b3ff77e9a25027a009db432f02bd60be8558f06ceb"

inherit autotools gettext pkgconfig

FILES_${PN} += "${datadir}/icons/*"