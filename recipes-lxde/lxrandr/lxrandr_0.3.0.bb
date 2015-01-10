SUMMARY = "LXDE Randr graphical frontend"
HOMEPAGE = "http://lxde.org/"
SECTION = "x11"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS = "virtual/libintl intltool-native xrandr gtk+"

SRC_URI = "${SOURCEFORGE_MIRROR}/lxde/lxrandr-${PV}.tar.xz"

SRC_URI[md5sum] = "250f0ebb09c1e02f430f951911ba1259"
SRC_URI[sha256sum] = "183deaed658c4a0ba937fc349e88330267b8309fc51f67f7ec4b4768ccc66b76"

inherit autotools-brokensep gettext pkgconfig
