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
        String[] b = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        double[] c = new double[]{1.01d, 2.02d, 3.03d, 4.04d, 5.05d, 6.06d, 7.07d, 8.08d, 9.09d, 10.11d };

        writeArray(a);
        writeArray(b);
        writeArray(c);
        writeArray(c, 5);

    }

    public static void writeArray ( int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Зачение: " + (arr[i] + 1));

        }
    }

    public static void writeArray( String[] arr){
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Зачение: " + (arr[i]));
        }
    }

    public static void writeArray( double[] arr){
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Зачение: " + (arr[i]));
        }
    }

    public static void writeArray( double[] arr, int numberOfPrints){
        for (int i = 0; i <= numberOfPrints-1; i++) {
            System.out.println("Зачение: " + (arr[i]));
        }
    }




}
