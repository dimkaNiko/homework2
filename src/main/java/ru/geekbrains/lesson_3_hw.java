package ru.geekbrains.ru.geekbrains;

import java.util.Arrays;
import java.util.Scanner;

public class lesson_3_hw {
    //Задание 2
     static boolean eqArr(int[] array) {
        int fullSumm = 0;
        for (int i = 0; i < array.length; i++) {
            fullSumm += array[i];
        }
            if (fullSumm % 2 != 0) return false;

        fullSumm /= 2;
        int halfSumm = 0;

        for (int i = 0; i < array.length; i++) {
            halfSumm += array[i];
            if (halfSumm == fullSumm) return true;
        }
        return false;
    }

    static void shiftArr(int[] arr, int n){
        int shift = (arr.length + n % arr.length) % arr.length;
        for (int i = 0; i < shift; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0 ; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }


    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner scanner = new Scanner(System.in);

    System.out.println(eqArr(new int[] {1, 2, 3, 4, 4, 3, 2, 1}));
    System.out.println(eqArr(new int[] {2, 2, 2, 1, 2, 2, 13, 1}));

    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    shiftArr(arr, 5);
    System.out.println(Arrays.toString(arr));


    }
}
