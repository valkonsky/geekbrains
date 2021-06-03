public class Cat extends Animal{
    private static int counter = 0;

 public Cat(){
     swimBehavior = new SwimNoWay();
     runBehavior = new CatRunning();
     counter ++;
 }

 public static int getAllCats(){
     return counter;
 }
}
