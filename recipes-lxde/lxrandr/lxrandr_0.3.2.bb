SUMMARY = "LXDE Randr graphical frontend"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "glib-2.0-native intltool-native virtual/libintl xrandr"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/lxde/lxrandr-${PV}.tar.xz \
    file://0001-lxrandr.c-improve-xrandr-output-parser-to-cope-with-.patch \
"

SRC_URI[md5sum] = "5101ab29d87fb2b56a5ec5bc8bc3f258"
SRC_URI[sha256sum] = "8b5edfc9718061bc161fe51d388697cbaa819d6f8013ed24ba22f438e0dbc312"

PACKAGECONFIG ?= "gtk3"
PACKAGECONFIG[gtk3] = "--enable-gtk3,,gtk+3"
python __anonymous () {
    depends = d.getVar("DEPENDS", d, 1)
    if 'gtk3' not in d.getVar('PACKAGECONFIG', True):
        d.setVar("DEPENDS", "%s gtk+" % depends)
}

inherit autotools-brokensep gettext pkgconfig
