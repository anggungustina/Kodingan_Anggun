package com.anggun.chapter9.tugas;

public class Ex2_TheStockclass {
    public static void main(String[] args) {

        Stock stock = new Stock("ORCL", "Pracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println("\nStock name: " + stock.name);
        System.out.println("Stock symbol: " + stock.symbol);
        System.out.printf("Price-change percemtage : %.2f%%\n", stock.getChangePercent());

    }
}
