package main.java;

public class Cat extends Animal{
    private static int counter = 0;

    public Cat(String name, int appetite){
     swimBehavior = new SwimNoWay();
     runBehavior = new CatRunning();
     this.name = name;
     this.appetite = appetite;
     this.satiety = false;
     counter ++;
 }

 public void eat(Plate plate){
     if (plate.decreaseFood(appetite)){
         satiety = true;
     }
 }

 public boolean isSatiety(){
     return satiety;
 }

 public static int getAllCats(){
     return counter;
 }
}
