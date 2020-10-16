package by.homework.homework1;

import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        chekIntegerNumber(scanner);
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        chekIntegerNumber(scanner);
        int secondNum = scanner.nextInt();
        System.out.println("Enter third number: ");
        chekIntegerNumber(scanner);
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
        System.out.println("(" + firstNum + " + " + secondNum + " + " + thirdNum + ") / 3 = " + arithMean);
        //ver2
        /*int maxNum = firstNum;
        if (maxNum < secondNum) {
            maxNum = secondNum;
        }
        if (maxNum < thirdNum) {
            maxNum = thirdNum;
        }
        System.out.println("max= " + maxNum);
        int minNum = firstNum;
        if (minNum > secondNum) {
            minNum = secondNum;
        }
        if (minNum > thirdNum) {
            minNum = thirdNum;
        }
        System.out.println("min= " + minNum);*/
    }

    public static void chekIntegerNumber(Scanner scanner){
        while (!scanner.hasNextInt()) {
            System.out.println("It is not an integer number!");
            System.out.println("Please enter an integer number: ");
            scanner.next();
        }
    }
}
