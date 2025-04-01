package com.geogodoy.aumigo.service;


import com.geogodoy.aumigo.domain.model.Animal;
import java.util.List;

public interface AnimalService {

    List<Animal>  getAll();

    Animal saveAnimal(Animal pet);

    Animal getAnimalById(Long id);

    List<Animal> getAnimalsByOrganization(Long organizationId);

    void deleteAnimal(Long id);
}
