package lesson03;

import java.util.Arrays;

public class lesson03 {

    public static int[][] myIntArray;
    public static int[] myIntArray2;

    public static void main(String[] args) {

        myIntegerArray();
        System.out.println(" *** *** *** ");
        myEmptyArray();
        System.out.println(" *** *** *** ");
        System.out.println(Arrays.toString(
                fillArray(new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 })));
        squareArray();
        System.out.println(" *** *** *** ");
        myReturnArray(10, 5);
        readReturnArray(myIntArray);
        System.out.println(" *** *** *** ");
        oneDimensionalArray();
        System.out.println(" *** *** *** ");

        int[] checkInArray = { 8, 1, 9, 5, 2, 1, 26 };
        System.out.println(Arrays.toString(checkInArray));
        System.out.println(myTrueArray(checkInArray));

    }

        /*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла
    и условия заменить 0 на 1, 1 на 0;
     */
        public static void myIntegerArray() {
            int[] myArray = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
            for (int i = 0; i < myArray.length; i++) {
                if(myArray[i] == 1) {
                    myArray[i] = 0;
                } else {
                    myArray[i] = 1;
                }
                System.out.print(myArray[i] + " | ");
            }
            System.out.println(" ");
        }

    /*
    2. Задать пустой целочисленный массив длиной 100. С помощью цикла
    заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
        public static void myEmptyArray() {
        int[] myArray = new int[100];
        for (int i = 0; i < 100; i++) {
            myArray[i] = i + 1;
            System.out.println("array[" + i + "] = " + myArray[i]);
        }
    }

    /*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по
    нему циклом, и числа меньшие 6 умножить на 2;
     */

        public static int[] fillArray(int[] myArray) {
            for (int i = 0; i < myArray.length; i++)
                if(myArray[i] < 6) {
                    myArray[i] *= 2;
                }
            return myArray;
        }

    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк
     и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные
      элементы единицами (можно только одну из диагоналей, если обе сложно).
      Определить элементы одной из диагоналей можно по следующему принципу:
      индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */

    public static void squareArray() {

        int[] [] table = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if(i == j) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }
                System.out.print(table[i][j] + " | ");
            }
            System.out.println();
        }
    }

    /*
    5. Написать метод, принимающий на вход два аргумента: len и initialValue, и
    возвращающий одномерный массив типа int длиной len, каждая ячейка которого
    равна initialValue;
     */

    public static void myReturnArray(int len, int initialValue) {
        myIntArray = new int[len][initialValue];
        int count = 5;
        for (int y = 0; y < myIntArray.length; y++) {
            for (int x = 0; x < myIntArray[y].length; x++) {
                myIntArray[y][x] = count;
            }
        }
    }

    public static void readReturnArray(int[][] inputArray) {
        for (int y = 0; y < inputArray.length; y++) {
            for (int x = 0; x < inputArray[y].length; x++) {
                System.out.print(inputArray[y][x] + "\t");
            }
            System.out.println();
        }
    }

     /*
    6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
     */

    public static void oneDimensionalArray() {

        int[] myArray = { 25, 11, 250, 5, 47, 288, 3, 16 };
        int maxNumber = myArray[0];
        int minNumber = myArray[0];

        for (int i = 0; i != myArray.length; i++) {
            if(maxNumber < myArray[i]) {
                maxNumber = myArray[i];

            } else if(minNumber > myArray[i]) {
                minNumber = myArray[i];
            }
        }
        System.out.print("Max element is " + maxNumber + " | ");
        System.out.print("Min element is " + minNumber);
        System.out.println();
    }

    /*
    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой
    части массива равны.
     */

    public static boolean myTrueArray(int[] myArray) {

        int firstSide = 0;
        int secondSide = 0;
        for (int i = 0; i < myArray.length - 1; i++) {
            firstSide += myArray[i];
            for (int j = i + 1; j < myArray.length; j++)
                secondSide += myArray[j];
            if(firstSide == secondSide)
                return true;
            secondSide = 0;
        }
        return false;
    }

    /*
    8. *** Написать метод, которому на вход подается одномерный массив и число n (может
    быть положительным, или отрицательным), при этом метод должен сместить все элементы
    массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя
    пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один
    вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    При каком n в какую сторону сдвиг можете выбирать сами.
     */

    //запуталась, не смогла решить

//    public static void displaceArray(int oneDimensionalArray) {
//        myIntArray2 = new int [oneDimensionalArray];
//        int n = 1;
//        for (int i = 0; i < myIntArray2.length; i++) {
//            if(n == 1) {
    
//            }
//        }
//    }

    }