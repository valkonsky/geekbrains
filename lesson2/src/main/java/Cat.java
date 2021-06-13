public class Cat extends Animal{
    private static int counter = 0;
    private int appetite;
    private boolean satiety;

 public Cat(int appetite){
     swimBehavior = new SwimNoWay();
     runBehavior = new CatRunning();
     counter ++;
     this.appetite = appetite;
     satiety = false;
 }

 public void eat(Plate p){
     if (p.getFood()<appetite){
         System.out.println("eat not enough");
     }else {
         p.decreaseFood(appetite);
         satiety = true;
     }
 }

 public static int getAllCats(){
     return counter;
 }
}
