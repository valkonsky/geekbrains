package lesson1;

public class Main {
    static void printThreeWords(){
        System.out.println("_Orange");
        System.out.println("_Banana");
        System.out.println("_Apple");
    }

    static void checkSumSign(int a, int b){
        int result = a+b;
        if (result>=0){
            System.out.println("сумма положительная");
        }else {
            System.out.println("сумма отрицательная");
        }
    }

    static void printColor(int value){
        if (value<0){
            System.out.println("Красный");
        }else if(value>0 && value<=100){
            System.out.println("Желтый");
        }else {
            System.out.println("Зеленый");
        }
    }

    static  void compareNumbers(int a,int b){
        if (a>=b){
            System.out.println("a>=b");
        }else {
            System.out.println("b>a");
        }
    }

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(5,7);
        printColor(101);
        compareNumbers(133,14);
    }
}
