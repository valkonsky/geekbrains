package main.java;

class CatRunning implements RunBehavior{

    @Override
    public void run(int distance) {
        if (distance<=200){
            System.out.println("i'm running on " + distance + " meters");
        }else{
            System.out.println("i can't running on this distance");
        }
    }
}
