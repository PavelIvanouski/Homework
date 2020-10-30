package by.homework.homework2;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int size = checkNumber(scanner);

        for (int i1 = 1, j1 = size; i1 <= size; i1++, j1--) {
            for (int i2 = 1, j2 = size; i2 <= size; i2++, j2--) {
                int minVal = min(min(i1, j1), min(i2, j2));
                System.out.print(" " + minVal + " ");
            }
            System.out.println();
        }
    }

    public static int min(int x, int y){
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

    public static int checkNumber(Scanner scanner){
        int number;
        do {
            System.out.println("Enter size (>0) :");
            while (!scanner.hasNextInt()) {
                System.out.println("It is not an integer positive number! Try again:");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (number <= 0);

        return number;
    }

}
