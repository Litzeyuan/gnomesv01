package gnomes.spring.gnomesv01.services.maps;

import gnomes.spring.gnomesv01.models.Bed;
import gnomes.spring.gnomesv01.services.interfaces.BedService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
@Profile({"default", "maps"})
public class BedMapService extends AbstractMapService<Bed, Long> implements BedService {
    @Override
    public Set<Bed> findAll() {
        return super.findAll();
    }

    @Override
    public Bed findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Long count() {
        return super.count();
    }

    @Override
    public void delete(Bed bed) {
        super.delete(bed);
    }

    @Override
    public Bed save(Bed bed) {
        return super.save(bed);
    }


    @Override
    public Optional<Bed> findByName(String name) {
        return null;
    }
}