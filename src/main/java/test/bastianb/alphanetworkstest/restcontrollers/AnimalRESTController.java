package test.bastianb.alphanetworkstest.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import test.bastianb.alphanetworkstest.models.Animal;
import test.bastianb.alphanetworkstest.service.AnimalService;


@RestController
@RequestMapping("/animal")
@CrossOrigin
public class AnimalRESTController {
    
    @Autowired
    AnimalService animalService;

    @RequestMapping(method=RequestMethod.GET)
    public List<Animal> getAllAnimal(@RequestParam(required = false) String type) {
        if(type != null) return animalService.getAllAnimalByType(type);

        return animalService.getAllAnimal();
    }

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Animal getAnimalById(@PathVariable Integer id) {
        return animalService.getAnimalById(id);
    }

    @RequestMapping(method=RequestMethod.POST)
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalService.saveAnimal(animal);
    }

    @RequestMapping(method=RequestMethod.PUT)
    public Animal updateAnimal(@RequestBody Animal animal) {
        return animalService.updateAnimal(animal);
    }

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteAnimalById(@PathVariable Integer id) {
        animalService.deleteAnimalById(id);
    }

}
