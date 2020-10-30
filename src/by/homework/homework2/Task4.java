package by.homework.homework2;

import java.util.Random;
import java.util.Scanner;

public class Task4{
    public static void main(String[] args){

        int minBound = 0;
        int maxBound = 100;

        Scanner scanner = new Scanner(System.in);
        int userNumber = checkNumber(scanner, minBound, maxBound);
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

    public static int checkNumber(Scanner scanner, int minBound, int maxBound){
        int number;
        do {
            System.out.println("Enter number from [" + minBound + ";" + maxBound + "]:");
            while (!scanner.hasNextInt()) {
                System.out.println("It is not an integer  number! Try again:");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number < minBound || number > maxBound);

        return number;
    }
}
