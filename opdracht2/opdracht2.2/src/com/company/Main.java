package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("hoe veel jaar oudben je?");
        int jaar = scanner.nextInt();

        System.out.println("en hoe veel maanden?");
        int maand = scanner.nextInt();

        int antwoord1 = (jaar * 365 * 24 * 60 );
        int antwoord2 = (maand / 12 * 365 * 24 * 60);

        int minuten = (antwoord1 + antwoord2);

        System.out.println("Je bent blijkbaar " + minuten + "minuten uit");

    }
}
