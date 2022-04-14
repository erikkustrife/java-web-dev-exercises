package org.launchcode.java.demos.lsn2controlflowandcollections;
import java.io.*;
public class ArrayPractice {

    public static void main(String args[]) throws IOException {
        int arrayPracticeArray[] = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < arrayPracticeArray.length; i++) {
            boolean isPrime = true;
            for (int j=2; j<i; j++){
            if (i%j==0){
                isPrime = false;
                break;
            }
        }
if (isPrime)
    System.out.println(i + " are the prime numbers in the array ");
    }
    }
}
