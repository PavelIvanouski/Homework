package by.homework.homework1;

import java.util.Scanner;

public class Task4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNum = scanner.nextInt();
        int leftVal = firstNum - firstNum / 10;
        int rightVal = firstNum + firstNum / 10;
        if (secondNum >= leftVal && secondNum <= rightVal) {
            System.out.println("Number " + secondNum + " in [" + leftVal + ";" + rightVal + "]");
        } else {
            System.out.println("Number " + secondNum + " not in [" + leftVal + ";" + rightVal + "]");
        }
    }
}
