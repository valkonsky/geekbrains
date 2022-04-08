package main.java;

public class Plate {
    private int food;

    Plate(int food){
        this.food = food;
    }

    public boolean decreaseFood(int n){
        if (food>=n){
            food -=n;
            return true;
        }else{
            System.out.println("not enough food");
        }
        return false;
    }

    public void info(){
        System.out.println("plate: " + food);
    }

    public void addFood(int food){
        this.food += food;
    }
}
