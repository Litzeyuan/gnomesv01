package gnomes.spring.gnomesv01.services;


import gnomes.spring.gnomesv01.models.Stage;
import gnomes.spring.gnomesv01.repositories.StageRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class GerminationStageService implements StageService {

    private StageRepository stageRepository;

    //constructor dependency injection
    public GerminationStageService(@Qualifier("germinationStageRepository") StageRepository stageRepository){
        this.stageRepository = stageRepository;
    }

    @Override
    public Stage findById(Long id) {
        return null;
    }

    @Override
    public void save(Stage object) {

    }

    @Override
    public void delete(Stage object) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public Stage findByName(String name) {
        return null;
    }

    @Override
    public Set<Stage> findAll() {
        return null;
    }
}
