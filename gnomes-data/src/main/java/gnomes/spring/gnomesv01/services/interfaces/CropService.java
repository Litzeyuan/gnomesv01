package gnomes.spring.gnomesv01.services.interfaces;


import gnomes.spring.gnomesv01.models.Crop;

public interface CropService extends CRUDService<Crop, Long>{

    Crop findByFamily(String family);

    Crop findByVariety(String variety);

}