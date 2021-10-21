package ru.vsu.cs.kislova_i_v;

public class Main {

    public static void main(String[] args) {
        
        int sum =0;

        for (int i = 100; i <= 999; i++) {
            int digit1 = i / 100;
            int digit2 = i / 10 % 10;
            int digit3 = i % 10;
            
            sum = calculateSum(i, digit1, digit2, digit3, sum);
        }
        writeArea(sum);
    }

    private static int calculateSum(int i, int digit1, int digit2, int digit3, int sum) {
        
        if (digit1 != digit2 && digit1 != digit3 && digit2 != digit3) {
            sum = sum + i;
            return sum;
        } 
        else {
            return sum;
        }
    }

    private static void writeArea(int sum) {
        
        System.out.printf("The sum of the numbers from 100 to 999,"
                + " such that in each number all the digits are different = %d",sum);
    }
}
