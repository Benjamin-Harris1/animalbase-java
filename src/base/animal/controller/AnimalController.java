package base.animal.controller;

import base.animal.data.Animal;

import java.util.*;

public class AnimalController implements Controller<Animal> {
    private Map<Integer, Animal> animals = new HashMap<>();
    private int nextId = 1;

    @Override
    public void create(Animal object) {
        object.setId(nextId);
        animals.put(nextId, object);
        nextId++;

    }

    @Override
    public Animal get(int id) {
        return animals.get(id);
    }

    @Override
    public List<Animal> getAll() {
        return new ArrayList<>(animals.values());
    }

    public List<Animal> getAllSorted(Comparator<Animal> comparator){
        List list = new ArrayList<>(animals.values());
        list.sort(comparator);
        return list;
    }

    public Set<Animal> getAllSorted(){
        return new TreeSet<>(animals.values());
    }

}
