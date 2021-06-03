public class Main {

    public static void main(String[] args) {
        Cat stepa = new Cat();
        stepa.performRun(100);
        Dog lord = new Dog();
        lord.performRun(300);

        AnimalFactory.getAllDogs();
        AnimalFactory.getAllCats();
        AnimalFactory.getAllAnimals();
    }
}
