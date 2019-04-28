package gnomes.spring.gnomesv01.bootstrap;

import gnomes.spring.gnomesv01.models.Crop;
import gnomes.spring.gnomesv01.models.Location;
import gnomes.spring.gnomesv01.services.interfaces.*;
import gnomes.spring.gnomesv01.services.map.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final LocationService locationService;
    private final BedService bedService;
    private final CropService cropService;
    private final SowingStageService sowingStageService;
    private final GerminationStageService germinationStageService;

    public DataLoader() {
        locationService = new LocationServiceMap();
        bedService = new BedServiceMap();
        cropService = new CropServiceMap();
        sowingStageService = new SowingStageServiceMap();
        germinationStageService = new GerminationStageServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Location DCU = new Location();
        DCU.setId(1L);
        DCU.setName("DCU");
        DCU.setAddress("Glasnevin, Dublin 9");

        Crop crop1 = new Crop();
        crop1.setId(1L);
        crop1.setLocation("DCU");
        crop1.setQuantity(25);
        crop1.setFamily("Beetroot");
        crop1.setVariety("Feur Kugal");

        Crop crop2 = new Crop();
        crop2.setId(2L);
        crop2.setLocation("DCU");
        crop2.setQuantity(35);
        crop2.setFamily("Bok Choy");
        crop2.setVariety("Pak Choi");





    }
}
