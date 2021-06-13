public class Main {

    public static void main(String[] args) {
        Cat stepa = new Cat(10);
        Cat ezhi = new Cat(10);
        Cat simon = new Cat(10);
        Cat tom = new Cat(10);
        Cat[] cats = new Cat[]{stepa,ezhi,simon,tom};
        Plate plate = new Plate(100);

        AnimalManager.eatAllCats(cats,plate);

        plate.addFoodIntoPlate(5000);
        plate.info();


    }
}
