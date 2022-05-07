package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static int[] selectSort(int[] array) {
        for (int x = 0; x < array.length; x++){
            int min_index = x;

            for (int i = x+1; i < array.length; i++){
                if (array[i] < array[min_index]){
                    min_index = i;
                }
            }
            int tmp = array[x];
            array[x] = array[min_index];
            array[min_index] = tmp;
        }
        return array;
    }
}
