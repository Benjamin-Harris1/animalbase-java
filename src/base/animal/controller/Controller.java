package base.animal.controller;

import java.util.ArrayList;

public interface Controller<T> {

    void create(T object);
    T get(int id);
    ArrayList<T> getAll();
}
