package com.company;

import java.util.ArrayList;

public class Gameboard {
    ArrayList<Character> list = new ArrayList<Character>();


    public Gameboard() {
        list.add('Q'); //this one is 0 and can't print anything
        list.add(' '); //this one and down are 1-9 and can be X or O
        list.add(' ');
        list.add(' ');
        list.add(' ');
        list.add(' ');
        list.add(' ');
        list.add(' ');
        list.add(' ');
        list.add(' ');

        reset();

    }

    public void reset() {
        list.set(0, 'Q'); //this one is 0 and can't print anything
        list.set(1, ' '); //this one and down are 1-9 and can be X or O
        list.set(2, ' ');
        list.set(3, ' ');
        list.set(4, ' ');
        list.set(5, ' ');
        list.set(6, ' ');
        list.set(7, ' ');
        list.set(8, ' ');
        list.set(9, ' ');

    }


    public boolean checkWinner() {

        // if player X and O are winner

        if (list.get(1) == list.get(2) && list.get(2) == list.get(3)) {
            if (list.get(1) == ' ') {
                return false;
            }
            System.out.println(list.get(2) + " is the winner!");
            return true;
        }

        if (list.get(4) == list.get(5) && list.get(5) == list.get(6)) {
            if (list.get(4) == ' ') {
                return false;
            }
            System.out.println(list.get(5) + " is the winner!");
            return true;
        }

        if (list.get(7) == list.get(8) && list.get(8) == list.get(9)) {
            if (list.get(7) == ' ') {
                return false;
            }
            System.out.println(list.get(8) + " is the winner!");
            return true;
        }

        if (list.get(1) == list.get(4) && list.get(4) == list.get(7)) {
            if (list.get(1) == ' ') {
                return false;
            }
            System.out.println(list.get(4) + " is the winner!");
            return true;
        }

        if (list.get(2) == list.get(5) && list.get(5) == list.get(8)) {
            if (list.get(2) == ' ') {
                return false;
            }
            System.out.println(list.get(5) + " is the winner!");
            return true;
        }

        if (list.get(3) == list.get(6) && list.get(6) == list.get(9)) {
            if (list.get(3) == ' ') {
                return false;
            }
            System.out.println(list.get(6) + " is the winner!");
            return true;
        }

        if (list.get(1) == list.get(5) && list.get(5) == list.get(9)) {
            if (list.get(1) == ' ') {
                return false;
            }
            System.out.println(list.get(5) + " is the winner!");
            return true;
        }

        if (list.get(3) == list.get(5) && list.get(5) == list.get(7)) {
            if (list.get(3) == ' ') {
                return false;
            }
            System.out.println(list.get(5) + " is the winner!");
            return true;
        }
        return false;
    }

    public boolean checkTie() {
        if ((!list.contains(' ')) && (!checkWinner())) {
            return true;

        }
        return false;
    }


    public void print() {

        System.out.println(" " + list.get(1) + " | " + list.get(2) + " | " + list.get(3));
        System.out.println(" - + - + - ");
        System.out.println(" " + list.get(4) + " | " + list.get(5) + " | " + list.get(6));
        System.out.println(" - + - + - ");
        System.out.println(" " + list.get(7) + " | " + list.get(8) + " | " + list.get(9));


    }


    public boolean placeMarker(int place, char symbol) {
        if (list.get(place) == ' ') {
            list.set(place, symbol);
            return true;
        }
        return false;
    }
}


