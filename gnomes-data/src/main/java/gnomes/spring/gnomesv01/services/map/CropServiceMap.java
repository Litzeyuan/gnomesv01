package gnomes.spring.gnomesv01.services.map;

import gnomes.spring.gnomesv01.models.Crop;
import gnomes.spring.gnomesv01.services.interfaces.CropService;

import java.util.Set;

public class CropServiceMap extends AbstractMapService<Crop, Long> implements CropService {

    @Override
    public Set<Crop> findAll() {
        return super.findAll();
    }

    @Override
    public Crop findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public int count() {
        return super.count();
    }

    @Override
    public void delete(Crop crop) {
        super.delete(crop);
    }

    @Override
    public void save(Crop crop) {
        super.save(crop.getId(), crop);
    }

    @Override
    public Crop findByFamily(String family) {
        return null;
    }

    @Override
    public Crop findByVariety(String variety) {
        return null;
    }
}
