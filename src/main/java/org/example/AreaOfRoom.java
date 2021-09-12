package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
public class AreaOfRoom
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("What is the length of the room in feet? ");
        String lenStr = input.nextLine();  // Read user input
        System.out.print("What is the width of the room in feet? ");
        String widthStr  = input.nextLine();  // Read user input
        int len = Integer.parseInt(lenStr);
        int width = Integer.parseInt(widthStr);
        int area = len * width;
        final double m2 = area * 0.09290304;
        String output1 = String.format("You entered dimensions of %d feet by %d feet.\nThe area is\n%d square feet\n%.3f square meters", len, width, area, m2);
        System.out.println(output1);
        input.close();
    }
}
