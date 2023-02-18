package com.anggun.chapter13.latihan;

public abstract class Lis1_GeometricObject {
    private String color = "white";
    private boolean filled;
    private final java.util.Date dateCreated;

    //buat objek geometris default
    protected Lis1_GeometricObject() {
        dateCreated = new java.util.Date();
    }

    //objek geometris diisi dengan warna dan nilai
    protected Lis1_GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on" + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
