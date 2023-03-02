package test.bastianb.alphanetworkstest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.bastianb.alphanetworkstest.models.Animal;
import test.bastianb.alphanetworkstest.repository.AnimalRepository;
import test.bastianb.alphanetworkstest.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    AnimalRepository animalRepository;
    
    @Override
    public List<Animal> getAllAnimal() {
        return animalRepository.findAll();
    }
    
    @Override
    public Animal getAnimalById(Integer id) {
        return animalRepository.findById(id).get();
    }

    @Override
    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal);
    }
    
    @Override
    public Animal updateAnimal(Animal animal) {
        return animalRepository.save(animal);
    }    

    @Override
    public void deleteAnimalById(Integer id) {
        animalRepository.deleteById(id);
    }
    
    @Override
    public List<Animal> getAllAnimalByType(String type) {
        return animalRepository.findByType(type);
    }
}
