package pl.agh.tai.portsadapter.soap.allegroapi.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import pl.agh.tai.portsadapter.soap.generated.*;

import javax.xml.rpc.holders.LongHolder;

@Component
class AllegroWebApiConnector {
    private static final Logger LOG = LoggerFactory.getLogger(AllegroWebApiConnector.class);
    private static final int SOME_MAGIC_NUMBER = 1;

    private static final int COUNTRY_CODE = 1; // Poland
    private ServicePort_PortType apiPort;

    public void login(String username, String encryptedPassword, String webApiKey) {
        ServiceServiceLocator service = new ServiceServiceLocator();

        try {
            apiPort = service.getservicePort();
            LongHolder currentVerKey = new LongHolder();

            LOG.info("Receiving webApiKey version...");
            DoQuerySysStatusRequest request = new DoQuerySysStatusRequest(SOME_MAGIC_NUMBER, COUNTRY_CODE, webApiKey);
            DoQuerySysStatusResponse doQuerySysStatusResponse = apiPort.doQuerySysStatus(request);
            long verKey = doQuerySysStatusResponse.getVerKey();
            LOG.info("done. Current version webApiKey={}", currentVerKey.value);
            LOG.info("Logging in... ");

            DoLoginEncRequest loginRequest = new DoLoginEncRequest(username, encryptedPassword,
                    COUNTRY_CODE, webApiKey, verKey);
            apiPort.doLoginEnc(loginRequest);
            LOG.info("done.");
        } catch (Exception e) {
            LOG.error("Error: {}", e);
        }
    }

    public ServicePort_PortType apiPort() {
        return apiPort;
    }
}
