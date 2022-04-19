package main.java;

public abstract class Animal {

    RunBehavior runBehavior;
    SwimBehavior swimBehavior;
    int appetite;
    String name;
    boolean satiety;

    public void performSwim(){
        swimBehavior.swim();
    }

    public void performRun(int distance){
        runBehavior.run(distance);
    }

    public void setSatiety(boolean satiety){
        this.satiety = satiety;
    }
}
