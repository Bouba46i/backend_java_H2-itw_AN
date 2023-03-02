package test.bastianb.alphanetworkstest.service;

import java.util.List;

import test.bastianb.alphanetworkstest.models.Animal;

public interface AnimalService {
    
    List<Animal> getAllAnimal();
    Animal getAnimalById(Integer id);
    Animal saveAnimal(Animal animal);
    Animal updateAnimal(Animal animal);
    void deleteAnimalById(Integer id);
    List<Animal> getAllAnimalByType(String type);
}
