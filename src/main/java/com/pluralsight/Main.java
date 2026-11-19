package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Pleae enter your name: ");
        String name = inputScanner.nextLine();

        System.out.printf("Hello " + name);

    }
}