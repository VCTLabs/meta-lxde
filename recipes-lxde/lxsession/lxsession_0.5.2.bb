SUMMARY = "LXDE session manager"
HOMEPAGE = "http://lxde.sf.net/"
SECTION = "x11"

PR = "r3"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=a76102f7f48780284bee49e6edaeb5a9"

DEPENDS = "dbus dbus-glib glib-2.0 intltool-native libgee libunique virtual/libx11 lxde-common polkit xproto"
RDEPENDS_${PN} = "upower dbus-x11"

SRC_URI  = "${SOURCEFORGE_MIRROR}/lxde/lxsession-${PV}.tar.xz"
SRC_URI += "file://gtk3.patch"
SRC_URI[md5sum] = "2957acccbf9ce37ef8205ec5424f8047"
SRC_URI[sha256sum] = "2d55e9ea80057fe5ffd68a91a15bb004ad7bf019e50807a8bb9b342115efaada"

PACKAGECONFIG ?= "gtk3"
PACKAGECONFIG[gtk3] = "--enable-gtk3,,gtk+3"
python __anonymous () {
    depends = d.getVar("DEPENDS", d, 1)
    if 'gtk3' not in d.getVar('PACKAGECONFIG', True):
        d.setVar("DEPENDS", "%s gtk+" % depends)
}

inherit autotools pkgconfig gettext

FILES_${PN} += "${datadir}/lxsession"
