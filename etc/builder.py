from iocbuilder import AutoSubstitution
from iocbuilder.modules.streamDevice import AutoProtocol

class ids3010(AutoSubstitution, AutoProtocol):
    '''Controls an attocube ids3010 interferometer'''

    ## Parse this template file for macros
    TemplateFile = 'ids3010.template'

    ## This is the streamDevice protocol file to use
    ProtocolFiles = ['ids3010.proto']
