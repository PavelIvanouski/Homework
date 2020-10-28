package by.homework.homework2;

import java.util.Scanner;

public class Task1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = scanner.nextInt();

        for (int i1 = 1, j1 = size; i1 <= size ; i1++, j1--) {
            for (int i2 = 1, j2 = size; i2 <= size ; i2++, j2--) {
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

}
