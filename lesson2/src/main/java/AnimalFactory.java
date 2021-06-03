public class AnimalFactory {

    public static void getAllDogs(){
        System.out.println(Dog.getAllDogs());
    }

    public static void getAllCats(){
        System.out.println(Cat.getAllCats());
    }

    public static void getAllAnimals(){
        System.out.println(Dog.getAllDogs() + Cat.getAllCats());
    }
}
