package com.technews;

public class VariablesPractice {
    public static void main(String[] args) {
        /*int i = 10;
        double d = 11.21;
        int sum1 = i + (int)d;
        double sum2 = i + d;
        System.out.println("sum1 : "+ sum1);
        System.out.println("sum2 : " + sum2);

        String s = "sudha";
        String sum3 = s + i;
        System.out.println("sum3 : " + sum3);

*/
        int a = 4;
        double b = 3.5;
        String c = "cat";

        // calculated variable sum is a double
        double sum = a + b;

        // calculated variable concat is a String
        String concat = a + c;

        // value of sum is 7.5
        System.out.println(sum);

        // value of concat is "4cat"
        System.out.println(concat);
    }
}
