public abstract class Animal {

    RunBehavior runBehavior;
    SwimBehavior swimBehavior;

    public void performSwim(){
        swimBehavior.swim();
    }

    public void performRun(int distance){
        runBehavior.run(distance);
    }
}
