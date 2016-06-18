SUMMARY = "Lightweight vte-based tabbed terminal emulator for LXDE"
HOMEPAGE = "http://lxde.sf.net"
SECTION = "x11"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

DEPENDS = "gtk+3 vte glib-2.0 intltool-native"

SRC_URI = "git://github.com/lxde/lxterminal.git;protocol=https"
SRCREV = "2cea95a7a8c4179e862ac3cb5036bf4e8316fff7"
S = "${WORKDIR}/git"

EXTRA_OECONF += "--enable-gtk3 --enable-man"

FILES_${PN} += "${datadir}/icons/hicolor/128x128/apps/lxterminal.png"

inherit autotools pkgconfig gettext

