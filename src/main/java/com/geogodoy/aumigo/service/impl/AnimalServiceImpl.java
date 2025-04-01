package com.geogodoy.aumigo.service.impl;

import com.geogodoy.aumigo.domain.model.Animal;
import com.geogodoy.aumigo.domain.repository.AnimalRepository;
import com.geogodoy.aumigo.service.AnimalService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalServiceImpl implements AnimalService {

    private AnimalRepository animalRepository;

    @Override
    public List<Animal>  getAll() {
        return animalRepository.findAll();
    }

    @Override
    public Animal saveAnimal(Animal pet) {
        return animalRepository.save(pet);
    }

    public Animal getAnimalById(Long id) {
        return animalRepository.findById(id).orElse(null);
    }

    @Override
    public List<Animal> getAnimalsByOrganization(Long organizationId) {
        return animalRepository.findByOrganizationId(organizationId);
    }

    @Override
    public void deleteAnimal(Long id) {
        animalRepository.deleteById(id);
    }
}
