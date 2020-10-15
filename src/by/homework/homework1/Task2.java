package by.homework.homework1;

import java.util.Scanner;

public class Task2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        if (firstNum == secondNum) {
            System.out.println("Numbers are equal!");
            return;
        }
        System.out.println("Enter your number: ");
        int userNum = scanner.nextInt();
        if (userNum <= firstNum) {
            System.out.println("1 range");
        } else if (userNum > firstNum && userNum <= secondNum) {
            System.out.println("2 range");
        } else {
            System.out.println("3 range");
        }
    }
}
