package com.anggun.chapter10.tugas;

public class MyInteger {
    private int value;

    MyInteger(int value) {
        this.value = value;
    }
    public int getValue() {
        return  value;
    }
    public boolean isEven(){
        return isEven(value);

    }
    public boolean isOdd(){
        return isOdd(value);
    }
    public  boolean isPrime(){
        return  isPrime(value);
    }
    public static  boolean isEven(int value) {
        return value % 2 == 0;
    }
    public static boolean isOdd(int value){
        return  value % 2 != 0;
    }
    public static boolean isPrime(int value){
        for (int divisor = 2; divisor <= value / 2; divisor++) {
            if(value % divisor == 0);
            return false;
        }
        return true;
    }
    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }
    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }
    public static boolean isPrime(MyInteger myInteger) {
        return  myInteger.isPrime();
    }
    public static  boolean equals(int value) {
        return  this.value == value;
    }
    public static boolean equals(MyInteger myInteger) {
        return  myInteger.value == this.value;
    }
    public static  int parseInt(char[] chars) {
        int value = 0;
        for (int i = 0, j = (int))Math.pow(10, chars.length -1);
        i < chars.length; i++, j /= 10)
    }
}
