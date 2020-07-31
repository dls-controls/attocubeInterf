cd "$(INSTALL)"

epicsEnvSet "EPICS_TS_MIN_WEST", '0'


# Loading libraries
# -----------------

# Device initialisation
# ---------------------

cd "$(INSTALL)"

dbLoadDatabase "dbd/example.dbd"
example_registerRecordDeviceDriver(pdbbase)

drvAsynIPPortConfigure("IPintr1", "10.108.8.11:9090", 100, 0, 0)

# Configure StreamDevice paths
epicsEnvSet "STREAM_PROTOCOL_PATH", "$(ATTOCUBEINTERF)/data"

# Final ioc initialisation
# ------------------------
cd "$(INSTALL)"
dbLoadRecords 'db/example_expanded.db'
iocInit
