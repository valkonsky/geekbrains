public class AnimalManager {

    public static void getAllDogs(){
        System.out.println(Dog.getAllDogs());
    }

    public static void getAllCats(){
        System.out.println(Cat.getAllCats());
    }

    public static void getAllAnimals(){
        System.out.println(Dog.getAllDogs() + Cat.getAllCats());
    }

    public static void eatAllCats(Cat[] cats,Plate plate){
        for (int i=0;i<cats.length;i++){
            cats[i].eat(plate);
            plate.info();
        }
    }
}
