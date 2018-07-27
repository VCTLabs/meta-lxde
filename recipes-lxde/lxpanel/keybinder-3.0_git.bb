SUMMARY = "Library for registering global key bindings, for gtk3 applications"
SECTION = "x11"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://libkeybinder/bind.c;endline=23;md5=636f1baf07d3322d3c5feaf7595c2168"

DEPENDS = "gtk+3"

SRC_URI = "git://github.com/kupferlauncher/keybinder.git;protoco=https;branch=master"
SRCREV = "04ae06724d914c7d4fec6a2723edf9c6320ec502"
PV = "0.3.2"
S = "${WORKDIR}/git"

# create a ChangeLog file, automake requires it
do_configure_prepend() {
    echo "See 'github.com/kupferlauncher/keybinder.git' commit log" > ${S}/ChangeLog
}

inherit autotools gettext gobject-introspection gtk-doc pkgconfig
