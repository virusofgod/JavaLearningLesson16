package ru.virusofgod;

import java.util.Locale;
import java.util.Scanner;

public class MethodPractice {
    public static void main(String[] args) {

        double num1 = getnumber();
        String operation = getoperation();
        double num2 = getnumber();
        double resault = calc(num1, num2, operation);
        System.out.println("Resault: " + resault);
    }

        /*


        псевдокод

        [модификаторы доступа] <ип возвращаемого значения> <название метода>([параметры]){

        тело метода

        }

        */


    private static double calc(double num1, double num2, String operation) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default: return num1 + num2;
        }
    }

    private static String getoperation() {

         Scanner in = new Scanner(System.in);
         String a = in.nextLine();
         return a;
         }




    private static double getnumber() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        return scanner.nextDouble();

    }
}