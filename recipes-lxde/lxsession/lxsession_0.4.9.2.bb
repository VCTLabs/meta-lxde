DESCRIPTION = "LXDE session manager"
HOMEPAGE = "http://lxde.sf.net/"
SECTION = "x11"

PR = "r2"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=a76102f7f48780284bee49e6edaeb5a9"

COMMON_DEPENDS = "gtk+ glib-2.0 lxde-common dbus libgee"
DEPENDS = "${COMMON_DEPENDS} xproto virtual/libx11"
RDEPENDS_{PN} = "${COMMON_DEPENDS} upower dbus-x11"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${PN}-${PV}.tar.gz"
SRC_URI += "file://lxsession-logout-git-62bfec81f6c50083423b8501a94be80125396966.patch"
SRC_URI[md5sum] = "bc3eb71936dbdf813e9ac2f00ab948f0"
SRC_URI[sha256sum] = "eff03e573b561cabe81c5d015d825e3d998e98d6621040113d7df471c8b9cfb4"

inherit autotools pkgconfig gettext

FILES_${PN} += "${datadir}/lxsession"
