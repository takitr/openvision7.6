SUMMARY = "DVBlast is a simple and powerful MPEG-2/TS demux and streaming application"
DESCRIPTION = "DVBlast is written to be the core of a custom IRD, CID, or ASI gateway, \
	based on a PC with a Linux-supported card. It is very lightweight and stable, designed for 24/7 operation."
SECTION = "multimedia"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=ed7e492ee44e70125a5d42e118354a13"

DEPENDS = "bitstream libev"

inherit gitpkgv autotools-brokensep

PV = "1.0+git${SRCPV}"
PKGV = "1.0+git${GITPKGV}"

SRC_URI = "git://github.com/OpenVisionE2/dvblast.git"

S = "${WORKDIR}/git"

do_compile_prepend() {
        sed -i 's#/usr/local#/usr#' ${S}/Makefile
}