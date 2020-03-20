package gl51.service.impl

import gl51.data.Ip
import gl51.service.IpService

import javax.inject.Inject

class BinaryConverterServiceImpl implements gl51.service.IpConverterService {

    @Inject
    IpService service
    @Override
    String getAndConvertIp() {
        Ip ip = service.fetchIp()

    }
}
