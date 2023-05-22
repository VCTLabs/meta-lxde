SUMMARY = "All packages required for base LXDE installation."
SECTION = "x11/wm"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

RDEPENDS:${PN} = " \
    lxappearance \
    lxappearance-obconf \
    lxde-icon-theme \
    lxde-common \
    lxmenu-data \
    lxpanel \
    lxsession \
    lxterminal \
    pcmanfm \
"
