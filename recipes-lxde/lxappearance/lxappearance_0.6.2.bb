SUMMARY = "LXDE GTK+ theme switcher"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "gtk+ intltool-native"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/${P}.tar.xz"
SRC_URI[md5sum] = "21ee79c7686a80efddaa1b7928f51e21"
SRC_URI[sha256sum] = "4462136e01f991d4c546f23a8cf59a4092f88ecdff587597959f8062e2ea201f"

inherit autotools gettext pkgconfig

fakeroot do_fixup_ownership () {
    find ${WORKDIR}/package/usr/src -exec chown 0:0 {} \;
}

addtask do_fixup_ownership after do_package before do_packagedata
