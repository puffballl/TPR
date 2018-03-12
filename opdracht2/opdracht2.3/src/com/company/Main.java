package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wat is het start bedrag?");
        float start = scanner.nextInt();

        System.out.println("En wat is het rente persentage?");
        double rente = scanner.nextInt();

        double eind = rente / 100 * start;

        System.out.println("Dan heb je een rente berdag van wel " + eind + " euro, zozo");

    }
}
