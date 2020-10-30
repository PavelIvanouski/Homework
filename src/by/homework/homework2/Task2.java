package by.homework.homework2;

import java.util.Scanner;

public class Task2{
    public static void main(String[] args){

        int[] daysInMonths = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        int monthNumber = checkNumber(scanner, "month");
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Month number not in [1,12]!");
            return;
        }
        int dayNumber = checkNumber(scanner, "day");
        if (dayNumber > 0 && dayNumber <= daysInMonths[monthNumber - 1]) {
            System.out.println("Month " + monthNumber + " has a day with " + dayNumber + " number.");
        } else {
            System.out.println("Month " + monthNumber + " has no day with " + dayNumber + " number.");
        }
    }

    public static int checkNumber(Scanner scanner, String kindNumber){
        int number;
        do {
            System.out.println("Enter a positive " + kindNumber + " number:");
            while (!scanner.hasNextInt()) {
                System.out.println("It is not an integer positive number! Try again:");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);

        return number;
    }
}

