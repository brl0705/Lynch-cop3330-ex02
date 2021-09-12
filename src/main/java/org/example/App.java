package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the input string?");
        String str = sc.nextLine();

        int stringLength = str.length();

        System.out.print("\n" + str);
        System.out.print(" has " + stringLength);
        System.out.print(" characters.");
    }
}
