package commision.core.fileobjectreaders.factories;

import commision.core.fileobjectreaders.ObjectFileReader;
import org.springframework.stereotype.Component;
import commision.core.fileobjectreaders.*;

/**
 * Created by Radek on 24.10.2017.
 */
@Component
public class PmaReaderFactory {

    public ObjectFileReader getInstance(SalesChannel channel) {
        switch (channel){
            case SSO:
                return new ReadPmaSso();
            case KKB:
                return new ReadPmaKKB();
            case ACTIVE:
                return new ReadPmaActive();
            case SPEED:
                return new ReadSpeed();
            default:
                return null;
        }
    }
}
