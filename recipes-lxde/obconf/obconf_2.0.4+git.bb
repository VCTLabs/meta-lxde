SUMMARY = "Tool for configuring the Openbox window manager"
HOMEPAGE = "http://openbox.org/wiki/ObConf:About"
SECTION = "x11"

SRCREV = "63ec47c5e295ad4f09d1df6d92afb7e10c3fec39"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=94d55d512a9ba36caa9b7df079bae19f"

DEPENDS = "gtk+3 glib-2.0 startup-notification openbox"

MIRRORS_prepend () {
    git://git.openbox.org/dana/obconf git://github.com/danakj/obconf.git
}

SRC_URI = "git://git.openbox.org/dana/obconf;branch=master;protocol=git \
           file://obconf-lxde"

S = "${WORKDIR}/git"

FILES_${PN} += "${datadir}/mime ${datadir}/mimelnk"

inherit autotools-brokensep pkgconfig gettext mime mime-xdg

do_configure_prepend () {
	autopoint --force || bbfatal "autopoint failed"
}

do_configure_append () {
	sed -i -e "/^Exec/s:obconf.*$:obconf-lxde:" ${S}/obconf.desktop || bbfatal "sed failed"
}

do_install_append () {
	install -m 0755 ${WORKDIR}/obconf-lxde ${D}${bindir}/
}
