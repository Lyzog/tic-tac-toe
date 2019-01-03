package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Gameboard gameboard = new Gameboard();
        Scanner input = new Scanner(System.in);

        System.out.println();
        while (true) {
            gameboard.reset();
            gameboard.print();

            while (!gameboard.checkWinner()) {

                boolean allowed1 = false;
                while (!allowed1) {
                    System.out.println("place your symbol X position 1-9 from left to right: ");
                    int placeX = input.nextInt();
                    allowed1 = gameboard.placeMarker(placeX, 'X');
                    gameboard.print();
                }
                if (gameboard.checkWinner()) {
                    break;
                } else if (gameboard.checkTie()) {

                    System.out.println("Tie");
                    break;
                } else {
                    boolean allowed2 = false;

                    while (!allowed2) {
                        System.out.println("place your symbol O position 1-9 from left to right: ");
                        int placeO = input.nextInt();
                        allowed2 = gameboard.placeMarker(placeO, 'O');
                        gameboard.print();
                    }
                }
            }
        }
    }
}







