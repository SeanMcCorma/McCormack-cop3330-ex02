package com.company;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sean McCormack
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input String? ");
        String user = input.nextLine();
        System.out.println(user + " has " + user.length()+ " characters.");
    }
}
