package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scan1 = new Scanner(System.in);
        int num_Of_Strangers = scan1.nextInt();


        if (num_Of_Strangers > 0) {
            String[] names = new String[num_Of_Strangers];
            Scanner scan2 = new Scanner(System.in);
            for (int i = 0; i < num_Of_Strangers; i++) {
                String name = scan2.nextLine();
                names[i] = name;
            }
            for (String name : names) System.out.println("Hello, " + name);
        } else if (num_Of_Strangers == 0) System.out.println("Oh, it looks like there is no one here");
        else System.out.println("Seriously? Why so negative?");

        }
    }
