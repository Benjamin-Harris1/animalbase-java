package base.animal.controller;

import base.animal.data.Animal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnimalController implements Controller<Animal> {
    private Map<Integer, Animal> animals = new HashMap<>();
    private int nextId = 1;

    @Override
    public void create(Animal object) {
        animals.put(nextId, object);
        System.out.println("Animal create with id: " + nextId);
        nextId++;

    }

    @Override
    public Animal get(int id) {
        return animals.get(id);
    }

    @Override
    public ArrayList<Animal> getAll() {
        return new ArrayList<>(animals.values());
    }
}
