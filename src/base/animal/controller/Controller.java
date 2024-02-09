package base.animal.controller;

import java.util.ArrayList;
import java.util.List;

public interface Controller<T> {

    void create(T object);
    T get(int id);
    List<T> getAll();
}
