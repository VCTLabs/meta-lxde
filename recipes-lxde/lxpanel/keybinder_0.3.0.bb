SUMMARY = "Library for registering global key bindings, for gtk-based applications"
SECTION = "x11"

PR = "r0"

LICENSE = "X11"
LIC_FILES_CHKSUM = "file://libkeybinder/bind.c;md5=2d2071c3f1c7563111ad40b6be7b0db6"

DEPENDS = "gtk+"

SRC_URI = "http://gentoo.inode.at/distfiles/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2a0aed62ba14d1bf5c79707e20cb4059"
SRC_URI[sha256sum] = "42863ca0174d568a8c02c6fb243fee1681823825e8bcb1718c51611d8e9793bb"

inherit autotools gettext pkgconfig

EXTRA_OECONF += " --disable-lua --disable-python"

FILES_${PN}-dbg += "${libdir}/lxpanel/plugins/.debug"
