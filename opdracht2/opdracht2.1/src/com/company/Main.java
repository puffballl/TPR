package com.company;


import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("hoeveel mijl wil je weten in kilometer?");
        double mijl = scanner.nextInt();
        double km = (mijl * 1.6 ) ;

        System.out.println("oke, dus " + mijl + " mijl is " + km + " kilometer." );

    }
}