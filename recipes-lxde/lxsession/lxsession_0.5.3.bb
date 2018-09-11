SUMMARY = "LXDE session manager"
HOMEPAGE = "http://lxde.sf.net/"
SECTION = "x11"

PR = "r3"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=a76102f7f48780284bee49e6edaeb5a9"

DEPENDS = "dbus dbus-glib glib-2.0 intltool-native libgee libunique virtual/libx11 lxde-common polkit vala-native xproto"
RDEPENDS_${PN} = "upower dbus-x11"

SRC_URI  = " \
    ${SOURCEFORGE_MIRROR}/lxde/lxsession-${PV}.tar.xz \
    file://0001-replace-use-of-UniqueApp-with-GtkApplication.patch \
    file://0002-GTK-3-GtkObject-no-longer-exists.patch \
"
SRC_URI[md5sum] = "823c50e6d0e4ce15a23a42e8f8bf4221"
SRC_URI[sha256sum] = "90bf42a45421f45f2c745d60f2c730176e1472642451c06c2ab07dcebdaf1fa8"

PACKAGECONFIG ?= "gtk3"
PACKAGECONFIG[gtk3] = "--enable-gtk3,,gtk+3"
python __anonymous () {
    depends = d.getVar("DEPENDS", d, 1)
    if 'gtk3' not in d.getVar('PACKAGECONFIG', True):
        d.setVar("DEPENDS", "%s gtk+" % depends)
}

inherit autotools pkgconfig gettext gobject-introspection

FILES_${PN} += "${datadir}/lxsession"
