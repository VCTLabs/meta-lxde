# build for x11, at least lxpanel needs this
PACKAGECONFIG:append = "${@bb.utils.contains('DISTRO_FEATURES', 'x11', ' x11', '', d)}"
