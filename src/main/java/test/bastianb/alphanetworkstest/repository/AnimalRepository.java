package test.bastianb.alphanetworkstest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import test.bastianb.alphanetworkstest.models.Animal;


public interface AnimalRepository extends JpaRepository<Animal, Integer> {

    List<Animal> findByType(String type);
    
}
