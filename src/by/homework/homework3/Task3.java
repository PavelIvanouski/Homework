package by.homework.homework3;

import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String userName = scanner.nextLine();
        System.out.println("Enter your age:");
        int userAge = scanner.nextInt();
        String strTemplate = "Hello, %s! You are %d years old. You look very younger than your age!";
        String strForm = String.format(strTemplate,userName,userAge);
        System.out.println(strForm);
    }
}
