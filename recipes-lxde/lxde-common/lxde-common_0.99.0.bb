DESCRIPTION="LXDE Session default configuration files"
HOMEPAGE="http://lxde.sf.net/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=597980c597fe9ce16d7b6b19c44cfced"

PR = "r1"

RDEPENDS_{PN} = "lxde-icon-theme"
DEPENDS = "gtk+ lxde-icon-theme intltool-native"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxde-common-${PV}.tar.xz"

SRC_URI[md5sum] = "5a417f5a0e5b510a0c018b66b0dc4081"
SRC_URI[sha256sum] = "43f17bf92e4695fdf2476c1964990d1d61c832726dd0778ae4cb462b9d29335c"

inherit autotools pkgconfig update-alternatives

FILES_${PN} += "${datadir}/lxde/ ${datadir}/lxpanel ${datadir}/xsessions"

ALTERNATIVE_${PN} = "x-window-manager"
ALTERNATIVE_LINK_NAME[x-window-manager] = "${bindir}/x-window-manager"
ALTERNATIVE_TARGET[x-window-manager] = "${bindir}/startlxde"
ALTERNATIVE_PRIORITY[x-window-manager] = "15"
