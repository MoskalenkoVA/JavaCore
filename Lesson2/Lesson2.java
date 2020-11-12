package Lesson2;

import java.util.Arrays;

public class Lesson2 {
    public static void main(String[] args) {

        String [][] myArray1 = new String[4][4];
        myArray1 [0][0] = "1";
        myArray1 [0][1] = "2";
        myArray1 [0][2] = "3";
        myArray1 [0][3] = "4";
        myArray1 [1][0] = "5";
        myArray1 [1][1] = "6";
        myArray1 [1][2] = "7";
        myArray1 [1][3] = "8";
        myArray1 [2][0] = "9";
        myArray1 [2][1] = "1";
        myArray1 [2][2] = "7";
        myArray1 [2][3] = "8";
        myArray1 [3][0] = "9";
        myArray1 [3][1] = "1";
        myArray1 [3][2] = "7";
        myArray1 [3][3] = "8";

        int sum = 0;
        Array array = new Array();

        try {
            sum = array.arraySize(myArray1);
            System.out.println("Result: "  + sum);
        } catch (MyArrayDataException | MyArraySizeException e) {
            System.out.println(e.getMessage());
        }






    }




}
