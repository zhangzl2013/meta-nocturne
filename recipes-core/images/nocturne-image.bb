# Copyright (C) 2020 Zhaolong Zhang <zhaolong.zhang@windriver.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "A console-only image with mor full-featured LInux system \
functionality installed"

IMAGE_FEATURES += " \
    ssh-server-openssh \
    dbg-pkgs \
    tools-debug \
    package-management \
    "
IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

inherit core-image
