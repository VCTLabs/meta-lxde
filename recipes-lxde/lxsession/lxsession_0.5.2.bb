SUMMARY = "LXDE session manager"
HOMEPAGE = "http://lxde.sf.net/"
SECTION = "x11"

PR = "r3"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=a76102f7f48780284bee49e6edaeb5a9"

DEPENDS = "dbus dbus-glib gtk+ glib-2.0 libgee libunique virtual/libx11 lxde-common polkit xproto"
RDEPENDS_{PN} = "upower dbus-x11"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxsession-${PV}.tar.xz"
SRC_URI[md5sum] = "2957acccbf9ce37ef8205ec5424f8047"
SRC_URI[sha256sum] = "2d55e9ea80057fe5ffd68a91a15bb004ad7bf019e50807a8bb9b342115efaada"

inherit autotools pkgconfig gettext

FILES_${PN} += "${datadir}/lxsession"
