package main.java;

public class Dog extends Animal{
    private static int counter = 0;

    public Dog(){
        swimBehavior = new Swim();
        runBehavior = new DogRunning();
        counter ++;
    }

    public static int getAllDogs(){
        return counter;
    }
}
