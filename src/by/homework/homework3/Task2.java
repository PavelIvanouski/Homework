package by.homework.homework3;

import java.util.Random;

public class Task2{
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
        //String test = "12 345 67 12 13 678";
        String regex = "\\b\\d{2}\\b";
        //System.out.println(test);
        System.out.println(str.replaceAll(regex, "-1"));

    }
}
