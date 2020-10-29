package by.homework.homework3;

import java.util.Random;

public class Task1{
    public static void main(String[] args){
        String str = "";
        int minBound = 0;
        int maxBound = 1000;
        Random random = new Random();
        for (int i = 0; i <= 100; i++) {
            int nextNum = random.nextInt(maxBound - minBound) + minBound;
            str += nextNum + " ";
        }
        System.out.println(str);

        String str1 = "";
        StringBuilder stringBuilder = new StringBuilder(str1);
        for (int i = 0; i <= 100; i++) {
            int nextNum = random.nextInt(maxBound - minBound) + minBound;
            stringBuilder.append(nextNum).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
