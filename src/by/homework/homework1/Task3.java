package by.homework.homework1;

import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter third number: ");
        int thirdNum = scanner.nextInt();
        if (firstNum > secondNum) {
            if (firstNum > thirdNum) {
                System.out.println("max= " + firstNum);
            } else {
                System.out.println("max= " + thirdNum);
            }
        } else {
            if (secondNum > thirdNum) {
                System.out.println("max= " + secondNum);
            } else {
                System.out.println("max= " + thirdNum);
            }
        }
        // ver2
        /*if (firstNum > secondNum && firstNum > thirdNum) {
            System.out.println("max= " + firstNum);
        } else if (secondNum > firstNum && secondNum > thirdNum) {
            System.out.println("max= " + secondNum);
        } else if (thirdNum > firstNum && thirdNum > secondNum) {
            System.out.println("max= " + thirdNum);
        } else if (firstNum == secondNum && firstNum == thirdNum) {
            System.out.println("Numbers are equal");
        }*/
        if (firstNum < secondNum) {
            if (firstNum < thirdNum) {
                System.out.println("min= " + firstNum);
            } else {
                System.out.println("min=" + thirdNum);
            }
        } else {
            if (secondNum < thirdNum) {
                System.out.println("min= " + secondNum);
            } else {
                System.out.println("min= " + thirdNum);
            }
        }
        double arithMean = (double) (firstNum + secondNum + thirdNum) / 3;
        ; //arithmetical mean - среднее арифметическое
        System.out.println(arithMean);
       /* int val = (int) (arithMean * 100) % 100;
        System.out.println("ost= " + val);*/
    }
}
