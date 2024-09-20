package com.example.task11;

import java.util.Objects;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if  (!Objects.isNull(arr) && arr.length > 0) {
            int min = Integer.MAX_VALUE;
            int buffer;
            int n = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= min) {
                    n = i;
                    min = arr[i];
                }
            }
            buffer = arr[0];
            arr[0] = arr[n];
            arr[n] = buffer;
        }
    }
}