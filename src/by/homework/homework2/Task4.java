package by.homework.homework2;

import java.util.Random;
import java.util.Scanner;

public class Task4{
    public static void main(String[] args){

        int minBound = 0;
        int maxBound = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from [" + minBound + " ; " + maxBound + "]");
        //checkNumber(scanner);
        int userNumber = scanner.nextInt();
        int counts = 1;
        Random random = new Random();
        while (true) {
            int guessedNumber = random.nextInt(maxBound - minBound + 1) + minBound;
            if (guessedNumber == userNumber) {
                System.out.println("Guessed number is " + guessedNumber + " . " + counts + " attempts.");
                break;
            }
            counts++;
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
