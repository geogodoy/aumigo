package com.geogodoy.aumigo.controller;
import com.geogodoy.aumigo.domain.model.Animal;
import com.geogodoy.aumigo.service.AnimalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalController {

    @Autowired
    private AnimalService petService;

    @GetMapping
    public List<Animal> getAll() {
        return petService.getAll();
    }

    @GetMapping("/{id}")
    public Animal getAnimal(@PathVariable Long id) {
        return petService.getAnimalById(id);
    }

    @GetMapping("/organization/{organizationId}")
    public List<Animal> getAnimalsByOrganization(@PathVariable Long organizationId) {
        return petService.getAnimalsByOrganization(organizationId);
    }

    @PostMapping("/save")
    public Animal addPet(@RequestBody Animal animal) {
        return petService.saveAnimal(animal);
    }

    @PutMapping("/update")
    public Animal updateAnimal(@RequestBody Animal animal) {
        return petService.saveAnimal(animal);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAnimal(@PathVariable Long id) {
        petService.deleteAnimal(id);
    }
}
