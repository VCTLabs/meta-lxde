SUMMARY = "Lightweight vte-based tabbed terminal emulator for LXDE"
HOMEPAGE = "http://lxde.sf.net"
SECTION = "x11"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

DEPENDS = "gtk+3 vte glib-2.0 intltool-native"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxterminal-${PV}.tar.gz \
           file://support_for_vte_0.38.0.patch \
"
SRC_URI[md5sum] = "e80ad1b6e26212f3d43908c2ad87ba4d"
SRC_URI[sha256sum] = "174b0e99652f72acd7a98b6ff1b75eba1a9bf364996e6f118cccdaba0d282baf"

EXTRA_OECONF += "--enable-gtk3"

FILES_${PN} += "${datadir}/icons/hicolor/128x128/apps/lxterminal.png"

inherit autotools pkgconfig gettext

