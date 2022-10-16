package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {

    //todo Task 1
    public static void oneMonthCalendar(int daysCount, int startDay){
        int count = 2 - startDay;

        if (daysCount < 28 || daysCount > 31 || startDay < 1 || startDay > 7){
            System.out.println("Ungültige Eingabe.");
            return;
        }

        for (int i = 0; count <= daysCount; i++) {
            calendarRow(count, daysCount);
            System.out.println("");
            count += 7;
        }

    }

    public static void calendarRow(int count, int daysCount){
        for (int i = 0; i < 7; i++) {
            if(count < 1){
                System.out.print("   ");
                count++;
            } else if (count < 10) {
                System.out.printf(" %d ",count);
                count++;
            } else if (count <= daysCount) {
                System.out.printf("%d ",count);
                count++;
            } else{
                return;
            }
        }
    }

    //todo Task 2
    public static long[] lcg(long seed){
        long[] result = new long[10];

        long m = (long) Math.pow(2, 31);
        long a = 1103515245;
        int c = 12345;

        for (int i = 0; i < 10; i++) {
            if (i == 0){
                result[0] = (((seed * a) + c) % m);
            }else {
            result[i] =((a * result[i - 1]) + c) % m;
                System.out.println(result[i]);
            }
        }
        return result;
    }

    //todo Task 3
    public static void guessingGame(int numberToGuess) {
        Scanner scanner = new Scanner(System.in);
        int guess;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Guess number " + i + ": ");
            guess = scanner.nextInt();
            if (numberToGuess == guess) {
                System.out.println("You won wisenheimer!");
                return;
            } else if (i == 10){
                System.out.println("You lost! Have you ever heard of divide & conquer?");
            }
            else if (guess > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");

            } else {
                System.out.println("The number AI picked is higher than your guess.");
            }
        }
    }

    public static int randomNumberBetweenOneAndHundred(){
        int min = 1;
        int max = 99;
        Random randomNumber = new Random();
        return min + randomNumber.nextInt(max);
    }

    //todo Task 4
    public static boolean swapArrays(int[] arrayA, int[] arrayB){
        int[] arrayC = new int[arrayA.length];

        if(arrayA.length == arrayB.length){
            for (int i = 0; i < arrayA.length; i++) {
                arrayC[i] = arrayA[i];
                arrayA[i] = arrayB[i];
                arrayB[i] = arrayC[i];
            }
            for (int i : arrayA) {
                System.out.print(i);
            }
            for (int i : arrayB) {
                System.out.print(i);
            }
            return true;
        }
        return false;
    }

    //todo Task 5
    public static String camelCase(String input){
        char array[] = input.toCharArray();
        boolean uppercase = true;
        StringBuilder output = new StringBuilder();

        for (int i : array) {
            if(i == ' '){
                uppercase = true;
            }
            if(uppercase){
                if(i >= 'A' && i <= 'Z'){
                    output.append((char) i);
                    uppercase = false;
                } else if (i >= 'a' && i <= 'z'){
                    output.append((char) (i - 32));
                    uppercase = false;
                }
            } else {
                if (i >= 'A' && i <= 'Z'){
                    output.append((char) (i + 32));
                } else if (i >= 'a' && i <= 'z'){
                    output.append((char) i);
                }
            }
        }
        return output.toString();
    }

    //todo Task 6
    public static int checkDigit(int[] checkNumber){
        int digit = 0;

        for (int i = 0; i < checkNumber.length; i++) {
            checkNumber[i] *= i + 2;
            digit += checkNumber[i];
        }

        digit = 11 - digit % 11;
        if(digit == 10){
            return  0;
        } else if (digit == 11) {
            return 5;
        }
        return digit;
    }


    public static void main(String[] args) {
        App exercise3 = new App();
/*
        System.out.println("Task 1: One Month Calendar");
        exercise3.oneMonthCalendar(31, 6);

        System.out.println("\nTask 2: Pseudo Random Numbers");
        exercise3.lcg();

        System.out.println("\nTask 3: Guessing Game");
        exercise3.guessingGame();

        int[] array1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] array2 = new int[]{100, 202, 30, 14, 15, 16};
        System.out.println("\nTask 4: Swap Arrays");
        exercise3.swapArrays(array1, array2);

        System.out.println("\nTask 5: CamelCase");
        exercise3.camelCase();

        System.out.println("\nTask 6: Check Digit");
        exercise3.checkDigit();
 */
    }
}
