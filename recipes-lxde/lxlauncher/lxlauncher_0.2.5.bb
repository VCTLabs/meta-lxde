SUMMARY = "LXDE Launcher"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"
PR = "r1"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "glib-2.0-native menu-cache intltool-native startup-notification"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxlauncher-${PV}.tar.xz"
SRC_URI[md5sum] = "94a7a36af92f8409365b6a25b6904eeb"
SRC_URI[sha256sum] = "cd14b59cf337e7ba0d67efc95cd79859ab5f0f85af5a84c7aff771f868c3dca7"

FILES:${PN} += "${datadir}/desktop-directories/* "

PACKAGECONFIG ?= "gtk3"
PACKAGECONFIG[gtk2] = ",,gtk+"
PACKAGECONFIG[gtk3] = "--enable-gtk3,,gtk+3"

inherit autotools-brokensep gettext pkgconfig

