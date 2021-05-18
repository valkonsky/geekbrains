package ru.gb.savilin;

public class Main {

    private static boolean isEqualsInterval(int a, int b){
        if ((a+b>=10)&&(a+b<=20)){
            return true;
        }else {
            return false;
        }
    }

    private static void printNegativeOrPositive(int a){
        if (a<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is positive");
        }
    }

    private static boolean isNegativeNumber(int a){
        if(a<0) return true;
        else{
            return false;
        }
    }

    private static void manyStringsPrinter(String s, int counter){
        for (int i=0;i<counter;i++){
            System.out.println(s);
        }
    }

    private static boolean isLeapYear(int year){
        if (year%4==0 && year%100!=0 || year%400==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isEqualsInterval(8,13));
        printNegativeOrPositive(5);
        System.out.println(isNegativeNumber(3));
        manyStringsPrinter("test",2);
        System.out.println(isLeapYear(800));
    }
}
