SUMMARY = "All packages required for full LXDE installation."
SECTION = "x11/wm"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup

RDEPENDS:${PN} = "\
    packagegroup-lxde-base \
"

RRECOMMENDS:${PN} = " \
    gpicview \
    l3afpad \
    lxhotkey \
    lxlauncher \
    lxinput \
    lxrandr \
    lxtask \
"
