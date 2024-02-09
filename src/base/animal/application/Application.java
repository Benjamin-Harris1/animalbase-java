package base.animal.application;

import base.animal.controller.AnimalController;

public class Application {

    public void start(){
        AnimalController animalController = new AnimalController();
        InitData initData = new InitData(animalController);
        initData.initialize();
        initData.getAllAnimals();
        initData.getAllSorted();
        initData.getSortedByAge();
    }


    public static void main(String[] args){
        Application app = new Application();
        app.start();
}
}
