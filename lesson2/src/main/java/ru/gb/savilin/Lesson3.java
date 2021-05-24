package ru.gb.savilin;

public class Lesson3 {
    private static int[] addDataIntoArray(){
        int [] a = new int[10];
        for (int i=0;i<a.length;i++){
            a[i] = ((int)(Math.round(Math.random())));
            System.out.println(a[i]);
        }
        System.out.println("--------------------------");
        return a;
    }

    private static void changeDataIntoArray(int [] arr){
        int [] arr2 = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            if (arr[i] == 0){
                arr2[i] = 1;
            }else{
                arr2[i] = 0;
            }
            System.out.println(arr2[i]);
        }
    }

    private static void addCounterIntoCell(){
        int arr[] = new int[100];
        for (int i = 0;i<100;i++){
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
    }

    private static void multipleLessThenSix(){
        int arr[] = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i< arr.length;i++){
            if (arr[i]<6){
                arr[i] = arr[i]*2;
            }
            System.out.println(arr[i]);
        }
    }

    private static void addDiagonalDataIntoSquareArray(){
        int arr[][] = new int[10][10];
        for (int i  = 0; i<10;i++){
            arr[i][i] = 1;
            arr[arr.length-(i+1)][i] = 1;
            //System.out.println("arr[" + i + "]["+ i +"] = " + arr[i][i]);
        }

        for (int i  = 0; i<arr.length;i++){
            for (int j  = 0; j< arr.length;j++){
                System.out.println("arr[" + i + "]["+ j +"] = " + arr[i][j]);
            }
        }
    }

    private static int[] createArray(int lenght, int initialvalue){
        int [] arr = new int[lenght];
        for (int i = 0;i<arr.length;i++) {
            arr[i] = initialvalue;
            //System.out.println(arr[i]);
        }
        return arr;
    }

    private static void getMinAndMaxValuesInArray(int [] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min = arr[i];
            }
            if (max<arr[i]){
                max= arr[i];
            }
        }
        System.out.println("min variable = " + min + " max variable = " + max);
    }

    private static boolean isEqualsLeftAndRightParts(int [] arr){
        int leftPart = 0;
        int rightPart = 0;
        for (int i=0,j=0;i<arr.length-j;i++){
            leftPart +=arr[i];
            if (leftPart>rightPart){
                rightPart+=arr[arr.length-1-j++];
            }

        }
        return rightPart == leftPart;
    }

    public static void main(String[] args) {
        //changeDataIntoArray();
        //changeDataIntoArray(addDataIntoArray());
        //addCounterIntoCell();
        //multipleLessThenSix();
        //addDiagonalDataIntoSquareArray();
        int [] arr = new int[]{7,4,12,5,8,11,35,55,44,181};
        //getMinAndMaxValuesInArray(arr);
        System.out.println(isEqualsLeftAndRightParts(arr));

    }
}
