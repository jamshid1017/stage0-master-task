package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
            return;
        }
        double a = (double) dividend / divider;
        double b = dividend / divider;
        if (a > b){
            System.out.println("cannot be divided completely");
        }
        else if (a == b){
            System.out.println("can be divided completely");
        }


    }

    public static void main(String[] args) {

    }

}
