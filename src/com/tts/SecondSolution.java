package com.tts;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SecondSolution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner input = new Scanner(System.in);

        try {
            int x = input.nextInt();
            int y = input.nextInt();
            System.out.println(x/y);
        } catch (ArithmeticException | InputMismatchException e){
            if ( e instanceof ArithmeticException){
                System.out.println("java.lang.ArithmeticException: / by zero");
            } else if ( e instanceof InputMismatchException){
                System.out.println("java.util.InputMismatchException");
            }
        } input.close();
    }

}

