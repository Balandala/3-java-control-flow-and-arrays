package com.example.task12;

import java.util.Objects;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (!Objects.isNull(arr) && arr.length > 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++)
                    if (arr[j] < arr[min])
                        min = j;

                int buffer = arr[min];
                arr[min] = arr[i];
                arr[i] = buffer;
            }
        }
    }
}