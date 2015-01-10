SUMMARY = "Library for file management"
HOMEPAGE = "http://pcmanfm.sourceforge.net/"

LICENSE = "GPLv2+ & LGPLv2+"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552 \
                    file://src/fm.h;beginline=8;endline=21;md5=ef1f84da64b3c01cca447212f7ef6007 \
                    file://src/base/fm-config.h;beginline=10;endline=23;md5=ef1f84da64b3c01cca447212f7ef6007 \
                    file://src/fm-gtk.h;beginline=6;endline=19;md5=646baa4955c04fe768f2ca27b92ac8dd"


SECTION = "x11/libs"
DEPENDS = "glib-2.0 pango gtk+ menu-cache intltool-native libexif libfm-extra"

SRC_URI = "${SOURCEFORGE_MIRROR}/pcmanfm/libfm-${PV}.tar.xz"

SRC_URI[md5sum] = "3ff38200701658f7e80e25ed395d92dd"
SRC_URI[sha256sum] = "c692f1624a4cbc8d1dd55f3b3f3369fbf5d26f63a916e2c295230b2344e1fbf9"

inherit autotools-brokensep pkgconfig gtk-doc

do_configure[dirs] =+ "${S}/m4"

PACKAGES += "${PN}-mime"
FILES_${PN}-mime = "${datadir}/mime/"
FILES_${PN}-dbg += "${libdir}/libfm/modules/.debug"

do_install_append () {
    # remove files which are part of libfm-extra
    rm -f ${D}/usr/include/libfm-1.0/fm-xml-file.h
    rm -f ${D}/usr/include/libfm-1.0/fm-version.h
    rm -f ${D}/usr/include/libfm-1.0/fm-extra.h
    rm -f ${D}/usr/lib/pkgconfig/libfm-extra.pc
    rm -f ${D}/usr/lib/libfm-extra.so*
    rm -f ${D}/usr/lib/libfm-extra.a
    rm -f ${D}/usr/lib/libfm-extra.la
}
