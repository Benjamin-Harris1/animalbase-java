package base.animal.application;

import base.animal.controller.AnimalController;
import base.animal.data.Animal;

import java.util.*;

public class InitData {
    private AnimalController animalController;

    public InitData(AnimalController animalController){
        this.animalController = animalController;
    }

    public void initialize(){
        animalController.create(new Animal("Søren the doggy dog", 37));
        animalController.create(new Animal("Peter", "fish", "Goldfish", 38));
        animalController.create(new Animal("Sham", "cat", "Asian cat", 11));
        animalController.create(new Animal("Kurt", "cat", "White cat", 7));
        animalController.create(new Animal("Scooby", "dog", "Labrador", 10));
    }

    public void getAllAnimals(){
        System.out.println("List:");
        List<Animal> animals = animalController.getAll();
        for (Animal animal : animals){
            System.out.println(animal.toString());
        }
    }
    public void getAllSorted(){
        System.out.println("Sorted by name:");
        // USe this instead: (a, b) -> a.getName().compareTo(b.getName())
        Collection<Animal> animals = animalController.getAllSorted(Comparator.comparing(Animal::getName));
        for (Animal animal : animals){
            System.out.println(animal.toString());
        }
    }
    public void getSortedByAge(){
        System.out.println("Sorted by age:");
        Collection<Animal> animals = animalController.getAllSorted(Comparator.comparing(Animal::getAge));
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
    
}
