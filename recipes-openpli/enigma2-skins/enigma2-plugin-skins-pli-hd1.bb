DESCRIPTION = "PLi HD1 skin"
MAINTAINER = "littlesat"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://usr/share/enigma2/PLi-HD/skin.xml;beginline=3;endline=8;md5=1d560d35b9194281a488eb3a32d9c8bf"

inherit gitpkgv allarch

PV = "0.1+git${SRCPV}"
PKGV = "0.1+git${GITPKGV}"

SRC_URI = "git://github.com/littlesat/skin-PLiHD.git"

FILES_${PN} = "/usr/share/enigma2/PLi-HD1/"

S = "${WORKDIR}/git"

do_compile() {
}

do_install() {
	install -d ${D}/usr/share/enigma2/PLi-HD1
	cp -r ${S}/usr/share/enigma2/PLi-HD1/* ${D}/usr/share/enigma2/PLi-HD1/
	chmod -R a+rX ${D}/usr/share/enigma2/PLi-HD1/
}