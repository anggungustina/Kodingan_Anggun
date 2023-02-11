package com.anggun.chapter7.tugas;

public class Ex24_Simulationcouponcollectorsproblem {
    public static void main(String[] args) {
        int[] deck = new int[52];
        int[] picks = new int[4];

        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        shufflecards(deck);

        int count = 0;
        do {
            pickCards(deck, picks);
            count++;
        } while (!isOneOfEachSuit(picks));

        print(picks);
        System.out.println("number of pick: " + count);
    }

    public static void shufflecards(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int index = pickCards(deck);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    public static void pickCards(int[] deck, int[] picks) {
        for (int i = 0; i < picks.length; i++) {
            picks[i] = deck[pickCards(deck)];
        }
    }

    public static int pickCards(int[] deck) {
        return (int) (Math.random() * deck.length);
    }

    public static boolean isOneOfEachSuit(int[] picks) {
        for (int i = 0; i < picks.length; i++) {
            for (int j = 0; j < picks.length; j++) {
                if (i != j && (picks[i] / 13 == picks[j] / 13))
                    return false;
            }
        }
        return true;
    }

    public static void print(int[] picks) {
        String[] suit = {"Spades", "Hearts", "Diamons", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < picks.length; i++) {
            System.out.println(ranks[picks[i] % 13] + " of " + suit[picks[i] / 13]);
        }
    }
}
