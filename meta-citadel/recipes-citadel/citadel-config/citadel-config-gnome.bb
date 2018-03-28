DESCRIPTION = ""
HOMEPAGE = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

S = "${WORKDIR}"

SRC_URI = "file://gsettings/90_citadel.gschema.override"

inherit allarch gsettings

do_install() {
    install -d ${D}${datadir}/glib-2.0/schemas
    install -m 644 ${S}/gsettings/90_citadel.gschema.override ${D}${datadir}/glib-2.0/schemas
}

FILES_${PN} = "/"
