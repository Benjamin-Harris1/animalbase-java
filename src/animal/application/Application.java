package animal.application;

import animal.generic.Animal;

public class Application {

    public void start(){
        Animal animal = new Animal("Horsey the horsing horse", 37);
        System.out.println(animal);
    }


    public static void main(String[] args){
        Application app = new Application();
        app.start();
}
}
