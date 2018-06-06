package commision.mvc.controllers.file;

import commision.core.dto.UploadFileDto;
import commision.core.entities.pma.Pma;
import commision.core.entities.pma.PmaSso;
import commision.core.services.database.PmaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pma")
public class PmaFileController {

    private PmaService service;

    @Autowired
    public PmaFileController(PmaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity saveFile(@ModelAttribute UploadFileDto fileDto){
        System.out.println("BaseImportFileEntity DTO: " + fileDto.toString());
        int amount = service.savePma(fileDto);
        System.out.println("Amount: " + amount);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Pma> createTestDecree(){

        PmaSso decreeSso = new PmaSso();
        decreeSso.setKodGlowny("ARAMS");
        decreeSso.setLogin("logn test");
        decreeSso.setPlanIlKsso(32.0);
        decreeSso.setKorekta(2);

        Pma pma = service.saveTest(decreeSso);

        return new ResponseEntity<Pma>(pma, HttpStatus.CREATED);
    }
}
