package commision.core.services.database;

import commision.core.dto.UploadFileDto;
import commision.core.entities.pma.Pma;

/**
 * Created by Radek on 24.10.2017.
 */
public interface PmaService {

    Pma saveTest(Pma pma);

    int savePma(UploadFileDto fileDto);
}
