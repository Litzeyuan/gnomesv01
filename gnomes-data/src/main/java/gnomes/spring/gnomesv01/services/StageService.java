package gnomes.spring.gnomesv01.services;

import gnomes.spring.gnomesv01.models.Stage;

import java.util.Set;

public interface StageService {

    Stage findById(long id);

    Stage findByName(String name);

    Set<Stage> findAll();
}