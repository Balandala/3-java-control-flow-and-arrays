package com.example.task13;

import java.util.Objects;

public class Task13Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static int[] removeMoreThen1000(int[] arr) {
        if (!Objects.isNull(arr)) {
            int amountOfBigNumbers = 0;
            for (int num : arr) {
                if (num > 1000)
                    amountOfBigNumbers++;
            }
            int[]newArr = new int[arr.length-amountOfBigNumbers];
            int j = 0;
            for (int element : arr) {
                if (element <= 1000) {
                    newArr[j] = element;
                    j++;
                }
            }
            return newArr;
        }
        return arr;
    }
}

