# build for x11, at least lxpanel needs this
PACKAGECONFIG_append = "${@base_contains('DISTRO_FEATURES', 'x11', ' x11', '', d)}"
