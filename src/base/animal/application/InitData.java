package base.animal.application;

import base.animal.controller.AnimalController;
import base.animal.data.Animal;

import java.util.ArrayList;

public class InitData {
    private AnimalController animalController;

    public InitData(AnimalController animalController){
        this.animalController = animalController;
    }

    public void initialize(){
        animalController.create(new Animal("Søren the doggy dog", 37));
        animalController.create(new Animal("Peter", "Fish", "Goldfish", 38));
        animalController.create(new Animal("Sham", "Cat", "Asian cat", 11));
        animalController.create(new Animal("Kurt", "Cat", "White cat", 7));
        animalController.create(new Animal("Scooby", "Dog", "Labrador", 10));
    }

    public void getAllAnimals(){
        ArrayList<Animal> animals = animalController.getAll();
        for (Animal animal : animals){
            System.out.println(animal.toString());
        }

    }
}
