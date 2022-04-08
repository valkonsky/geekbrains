package main.java;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = new Cat[]{new Cat("Murzik",20),
                                new Cat("Stepa",10),
                                new Cat("Ezhi",500),};

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            System.out.println(cats[i].name + " " + cats[i].isSatiety());
        }
    }
}