package by.homework.homework2;

import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //ver1
        int count = 5;
        while (true) {
            if (count == 0) {
                System.out.println("Your answers are not correct.");
                break;
            }
            System.out.println("6 * 3 = ?. You have " + count + " attempts. (Press 0 to give up)");
            checkNumber(scanner);
            int answer = scanner.nextInt();
            if (answer == 18) {
                System.out.println("18. Your answer is correct! ");
                break;
            } else if (answer == 0) {
                System.out.println("Sorry, you gave up.");
                break;
            }
            count--;
        }

        //ver2
        /*boolean rightAnswer = false;
        boolean aborted = false;
        for (int count = 5; count > 0; count--) {
            System.out.println("6 * 3 = ?. You have " + count + " attempts. (Press 0 to give up)");
            checkNumber(scanner);
            int answer = scanner.nextInt();
            if (answer == 18) {
                rightAnswer = true;
                break;
            } else if (answer == 0) {
                aborted = true;
                break;
            }
        }
        if (rightAnswer) {
            System.out.println("18. Your answer is correct! ");
        } else if (aborted) {
            System.out.println("Sorry, you gave up.");
        } else {
            System.out.println("Your answers are not correct.");
        }*/
    }

    public static void checkNumber(Scanner scanner){
        while (!scanner.hasNextInt()) {
            System.out.println("It is not an integer number!");
            System.out.println("Please enter an integer number: ");
            scanner.next();
        }
    }
}
