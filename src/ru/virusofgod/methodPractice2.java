package ru.virusofgod;

public class methodPractice2 {
    public static void main(String[] args) {
         /*
         псевдокод
         [модификаторы доступа] <ип возвращаемого значения> <название метода>([параметры]){
         тело метода
         }
        */

        int[] a = new int[]{10, 15 , 20, 75, 30};
        writeArray(a);

    }

    public static void writeArray ( int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Зачение: " + (arr[i] + 1));

        }
    }




}
