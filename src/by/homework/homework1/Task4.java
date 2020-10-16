package by.homework.homework1;

import java.util.Scanner;

public class Task4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        checkDoubleNumber(scanner);
        double firstNum = scanner.nextDouble();
        System.out.println("Enter second number: ");
        checkDoubleNumber(scanner);
        double secondNum = scanner.nextDouble();
        double leftVal = firstNum - firstNum / 10;
        double rightVal = firstNum + firstNum / 10;
        if (secondNum >= leftVal && secondNum <= rightVal) {
            System.out.println("Number " + secondNum + " in [" + leftVal + ";" + rightVal + "]");
        } else {
            System.out.println("Number " + secondNum + " not in [" + leftVal + ";" + rightVal + "]");
        }
    }

    public static void checkDoubleNumber(Scanner scanner){
        while (!scanner.hasNextDouble()) {
            System.out.println("It is not a number!");
            System.out.println("Please enter a number: ");
            scanner.next();
        }
    }
}
