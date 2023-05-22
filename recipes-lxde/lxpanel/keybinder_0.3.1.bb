SUMMARY = "Library for registering global key bindings, for gtk applications"
SECTION = "x11"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://libkeybinder/bind.c;endline=23;md5=636f1baf07d3322d3c5feaf7595c2168"

DEPENDS = "gtk+"

SRC_URI = "http://gentoo.inode.at/distfiles/keybinder-${PV}.tar.gz"
SRC_URI[md5sum] = "a6d7caae0dcb040b08692b008a68a507"
SRC_URI[sha256sum] = "879f07130ac64792ddb9fd758e6673119283bda37d75573787ae22af8684a240"

inherit autotools gettext gobject-introspection pkgconfig

EXTRA_OECONF += " --disable-lua --disable-python"

FILES:${PN}-dbg += "${libdir}/lxpanel/plugins/.debug"
