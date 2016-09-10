DESCRIPTION="LXDE Session default configuration files"
HOMEPAGE="http://lxde.sf.net/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=597980c597fe9ce16d7b6b19c44cfced"

RDEPENDS_{PN} = "lxde-icon-theme"
DEPENDS = "intltool-native"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxde-common-${PV}.tar.xz"

SRC_URI[md5sum] = "3ab92bd7bcff8bc8e6395651d164cf76"
SRC_URI[sha256sum] = "8ca5ea3185fd3cacc28116cd9adfdc3b1d92a4ff891fccf135d35f0224c29827"

inherit autotools gettext update-alternatives

FILES_${PN} += "${datadir}/lxde/ ${datadir}/lxpanel ${datadir}/xsessions"

ALTERNATIVE_${PN} = "x-window-manager"
ALTERNATIVE_LINK_NAME[x-window-manager] = "${bindir}/x-window-manager"
ALTERNATIVE_TARGET[x-window-manager] = "${bindir}/startlxde"
ALTERNATIVE_PRIORITY[x-window-manager] = "15"
