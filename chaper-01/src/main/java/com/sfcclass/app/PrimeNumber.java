package com.sfcclass.app;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int n = 2; n <= 100; n++) {
            if (isPrime(n)) {
                System.out.println(n);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
