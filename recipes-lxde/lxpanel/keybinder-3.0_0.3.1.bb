SUMMARY = "Library for registering global key bindings, for gtk3 applications"
SECTION = "x11"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://libkeybinder/bind.c;endline=23;md5=636f1baf07d3322d3c5feaf7595c2168"

DEPENDS = "gtk+3"

SRC_URI = "http://gentoo.inode.at/distfiles/keybinder-3.0-${PV}.tar.gz"
SRC_URI[md5sum] = "73a1c7cef6c651d9f17acbf68688e0cd"
SRC_URI[sha256sum] = "d97d699f31169976e4cda49a8490f69326e652269a2379907a805948d116fd23"

inherit autotools gettext gobject-introspection pkgconfig

FILES_${PN}-dbg += "${libdir}/lxpanel/plugins/.debug"
