package pl.agh.tai.portsadapter.soap.allegroapi.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import pl.agh.tai.portsadapter.soap.generated.AllegroWebApiPortType;
import pl.agh.tai.portsadapter.soap.generated.AllegroWebApiServiceLocator;

import javax.xml.rpc.holders.LongHolder;
import javax.xml.rpc.holders.StringHolder;

@Component
class AllegroWebApiConnector {
    private static final Logger LOG = LoggerFactory.getLogger(AllegroWebApiConnector.class);
    private static final int SOME_MAGIC_NUMBER = 1;

    private static final int COUNTRY_CODE = 1; // Poland
    private AllegroWebApiPortType apiPort;
    private StringHolder sessionHolder;


    public void login(String username, String encryptedPassword, String webApiKey) {
        AllegroWebApiServiceLocator service = new AllegroWebApiServiceLocator();

        try {
            apiPort = service.getAllegroWebApiPort();

            StringHolder info = new StringHolder();
            LongHolder currentVerKey = new LongHolder();

            LOG.info("Receiving webApiKey version...");
            apiPort.doQuerySysStatus(SOME_MAGIC_NUMBER, COUNTRY_CODE, webApiKey, info, currentVerKey);
            LOG.info("done. Current version webApiKey={}", currentVerKey.value);

            sessionHolder = new StringHolder();
            LongHolder userId = new LongHolder();
            LongHolder serverTime = new LongHolder();
            LOG.info("Logging in... ");

            apiPort.doLoginEnc(username, encryptedPassword,
                    COUNTRY_CODE, webApiKey, currentVerKey.value, sessionHolder, userId,
                    serverTime);
            LOG.info("done.");

        } catch (Exception e) {
            LOG.error("Error: {}", e);
        }
    }

    public AllegroWebApiPortType apiPort() {
        return apiPort;
    }

    public StringHolder sessionHolder() {
        return sessionHolder;
    }
}
