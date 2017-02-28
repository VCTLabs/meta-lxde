SUMMARY = "Tool for configuring the Openbox window manager"
HOMEPAGE = "http://openbox.org/wiki/ObConf:About"
SECTION = "x11"

SRCREV = "fa924b595e37f1b13ba4c2e64c367b92bbd3c771"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = "gtk+ glib-2.0 libglade startup-notification openbox"

MIRRORS_prepend () {
    git://git.openbox.org/dana/obconf git://github.com/danakj/obconf.git
}

SRC_URI = "git://git.openbox.org/dana/obconf;branch=master;protocol=git \
           file://obconf-lxde"

S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}/mime ${datadir}/mimelnk"

inherit autotools-brokensep pkgconfig gettext mime

do_configure_prepend () {
	autopoint --force || bbfatal "autopoint failed"
}

do_configure_append () {
	sed -i -e "/^Exec/s:obconf.*$:obconf-lxde:" ${S}/obconf.desktop || bbfatal "sed failed"
}

do_install_append () {
	install -m 0755 ${WORKDIR}/obconf-lxde ${D}${bindir}/
}
