package com.anggun.chapter5.tugas;

public class exercises40_SimulationHeadOrTails {
    public static void main(String[] args) {
        int heads, tails, coin;
        heads = tails = 0;
        System.out.println("Fipping a coin one million times..");
        for (int i = 0; i < 1000000; i++) {
            coin = (int) (Math.random() * 2) == 0 ? heads++ : tails++;
        }
        System.out.println("Heads: " + heads + "\nTails: " + tails);
    }
}
/*(Simulation: heads or tails) Write a program that simulates flipping a coin one
million times and displays the number of heads and tails.

 */