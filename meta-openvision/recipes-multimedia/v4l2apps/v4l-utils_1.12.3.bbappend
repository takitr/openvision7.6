inherit autotools-brokensep
DEPENDS_append_class-target = " udev"
LDFLAGS_append = " -pthread"

PACKAGES =+ " dvbfetool"

FILES_dvbfetool = "${bindir}/dvb-fe-tool"
