package com.company;

public class hanoiRecursion {

    public void diskSolver(int numOfDisks, String towerOne, String towerTwo, String towerThree)
    {
        if (numOfDisks == 1)
            System.out.println("Move disk at " + towerOne + " to " + towerThree);
        else
        {
            diskSolver(numOfDisks - 1, towerOne, towerThree, towerTwo);
            System.out.println("Move disk at " + towerOne + " to " + towerThree);
            diskSolver(numOfDisks - 1, towerTwo, towerOne, towerThree);
        }
    }
}