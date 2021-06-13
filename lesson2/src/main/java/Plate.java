public class Plate {

    private int food;

    public Plate(int food){
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n){
        food -=n;
    }

    public void info(){
        System.out.println("plate: " + food);
    }

    public void addFoodIntoPlate(int food){
        this.food += food;
    }
}
