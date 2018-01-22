package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Tower of Hanoi Game");
        System.out.println("This program will solve this puzzle for you.");
        System.out.println("Please input the number of disks you want to solve:");
        Scanner kb = new Scanner(System.in);
        int disks = kb.nextInt();

        hanoiRecursion tower1 = new hanoiRecursion();
        tower1.diskSolver(disks, "Tower 1", "Tower 2", "Tower 3");

        double calc = Math.pow(2, disks);
        double fin = calc - 1;
        System.out.println("It takes a minimum of " + fin + " moves to complete the game.");
    }
}