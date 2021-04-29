package ru.geekbrains.lesson2_hw;

public class homeWork2 {

    // Задание №1
    public static void invArr () {
        int[] arr = {1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
                System.out.print(" " + (arr[i]));
            } else {
                arr[i] = 1;
                System.out.print(" " + (arr[i]));
            }
        }

    }

    //Задание 2
    public static void fillArr() {

        int[] arr1 = new int[8];
        for(int i = 0, j = 0; i < arr1.length; i++, j += 3){
            arr1[i] += j;
            System.out.print(" " + (arr1[i]));
        }
    }

    //Задание 3
    public static void changeArr() {
        int arr2[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int w = 0; w < arr2.length; w++) {
            if (arr2[w] < 6) {
                arr2[w] *= 2;
                System.out.print(" " + (arr2[w]));
            } else if (arr2[w] >= 6)
                System.out.print(" " + (arr2[w]));
        }

    }

    //Задание 4
    public static void square(){
        int size = 5; // length of array

        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i == j) || (i == size - 1 - j)) {
                    arr[i][j] = 1;
                }
            }
        }

        //CHECK
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Задание 5
    public static void maxArr() {

        int maxArr[] = {1, 5, 3, 2, 11, 4, 5, 2, 14, 8, 9, 1};
        int max = maxArr[0];
        int min = maxArr[0];
        for (int a = 0; a < maxArr.length - 1; a++) {
            if (maxArr[a] > max){
                max = maxArr[a];
            } else if (maxArr[a] < min){
                min = maxArr[a];
            }

        } System.out.print("Наибольшее число: " + max + "\nНаименьшее число: " + min);
    }

    public static void main(String[] args) {

   invArr();
        System.out.println(" ");
   fillArr();
        System.out.println(" ");
   changeArr();
        System.out.println(" ");
        maxArr();
    square();



    }
}
