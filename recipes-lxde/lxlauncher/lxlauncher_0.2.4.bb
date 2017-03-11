SUMMARY = "LXDE Launcher"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"
PR = "r1"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "glib-2.0-native menu-cache intltool-native startup-notification"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxlauncher-${PV}.tar.xz"
SRC_URI[md5sum] = "8a21590c085ad82f4f50e4affb7ad0ab"
SRC_URI[sha256sum] = "01b7408a6d6f42769e94a54028f56dc8e724c2271d6bc01712b728569c1b9103"

FILES_${PN} += "${datadir}/desktop-directories/* "

PACKAGECONFIG ?= "gtk3"
PACKAGECONFIG[gtk2] = ",,gtk+"
PACKAGECONFIG[gtk3] = "--enable-gtk3,,gtk+3"

inherit autotools-brokensep gettext pkgconfig

