package by.homework.homework1;

import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        chekIntegerNumber(scanner);
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        chekIntegerNumber(scanner);
        int secondNum = scanner.nextInt();
        if (firstNum == secondNum) {
            System.out.println("Numbers are equal!");
            return;
        }
        System.out.println("Enter your number: ");
        chekIntegerNumber(scanner);
        int userNum = scanner.nextInt();
        if (userNum <= firstNum) {
            System.out.println("Number " + userNum + " is in the 1 range");
        } else if (userNum > firstNum && userNum <= secondNum) {
            System.out.println("Number " + userNum + " is in the 2 range");
        } else {
            System.out.println("Number " + userNum + " is in the 3 range");
        }
    }

    public static void chekIntegerNumber(Scanner scanner){
        while (!scanner.hasNextInt()) {
            System.out.println("It is not an integer number!");
            System.out.println("Please enter an integer number: ");
            scanner.next();
        }
    }
}
