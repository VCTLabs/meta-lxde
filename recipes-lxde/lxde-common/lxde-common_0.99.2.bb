DESCRIPTION="LXDE Session default configuration files"
HOMEPAGE="http://lxde.sf.net/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=597980c597fe9ce16d7b6b19c44cfced"

RDEPENDS_${PN} = "lxde-icon-theme"
DEPENDS = "intltool-native"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxde-common-${PV}.tar.xz \
           file://lxde-common-replace_am_glib_gnu_gettext.patch \
"

SRC_URI[md5sum] = "14a9d19c4576dc15d985453ccb8ca9f6"
SRC_URI[sha256sum] = "1cd9bc900960c995d48ffbbdc86ecffda7c806168c67aaa50c53113794234856"

inherit autotools gettext update-alternatives

FILES_${PN} += "${datadir}/lxde/ ${datadir}/lxpanel ${datadir}/xsessions"

ALTERNATIVE_${PN} = "x-window-manager"
ALTERNATIVE_LINK_NAME[x-window-manager] = "${bindir}/x-window-manager"
ALTERNATIVE_TARGET[x-window-manager] = "${bindir}/startlxde"
ALTERNATIVE_PRIORITY[x-window-manager] = "15"
