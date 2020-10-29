package by.homework.homework2;

import java.util.Scanner;

public class Task2{
    public static void main(String[] args){

        int[] daysInMonths = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number:");
        checkNumber(scanner);
        int monthNumber = scanner.nextInt();
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Month number not in [1,12]!");
            return;
        }
        System.out.println("Enter day number:");
        checkNumber(scanner);
        int dayNumber = scanner.nextInt();
        if (dayNumber > 0 && dayNumber <= daysInMonths[monthNumber - 1]) {
            System.out.println("Month " + monthNumber + " has a day with number " + dayNumber);
        } else {
            System.out.println("Month " + monthNumber + " has no day with number " + dayNumber);
        }
    }

    public static void checkNumber(Scanner scanner){
        while (!scanner.hasNextInt()) {
            System.out.println("It is not an integer number!");
            System.out.println("Please enter an integer number: ");
            scanner.next();
        }
    }
}

