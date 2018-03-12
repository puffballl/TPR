package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        int random1 = (int) Math.floor(Math.random() * 11);
        int random2 = (int) Math.floor(Math.random() * 11);

        int som = random1 + random2;

        System.out.println("Ik heb een vraagje? wat is " + random1 + " + " + random2 + "?");
        int antwoord = scanner.nextInt();

        if (som == antwoord){
            System.out.println("hey, het is inderdaad " + antwoord);
        }
        else if (som != antwoord){
            System.out.println("Nou, ik denk niet dat het " + antwoord + " is.");
        }


    }
}
