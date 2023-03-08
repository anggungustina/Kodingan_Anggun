package com.anggun.chapter10.tugas;

public class Myrectangle2D {
    private double x;
    private double y;
    private double width;
    private double heigth;

    Myrectangle2D() {
        this(0, 0, 1, 1);
    }

    Myrectangle2D(double x, double y, double width, double heigth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;

    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public double getHeigth() {
        return heigth;
    }

    public double getWidth() {
        return width;
    }

    public double gerArea() {
        return width * heigth;
    }

    public double getPerimeter() {
        return 2 * (width * heigth);

    }

    public boolean contains(double x, double y) {
        return getDistance(this.y, y) <= heigth / 2 && getDistance(this.x, x) <= width / 2;
    }

    public boolean contains(Myrectangle2D r) {
        return
                getDistance(y, r.getY()) + r.getHeigth() / 2 <= heigth / 2 &&
                        getDistance(x, r.getX()) + r.getWidth() / 2 <= width / 2 &&
                        heigth / 2 + r.getHeigth() / 2 <= heigth &&
                        width / 2 + r.getWidth() / 2 <= width;
    }

    public boolean overlaps(Myrectangle2D r) {
        return !contains(r) &&
                ((x + width / 2 > r.getX() - r.getWidth()) ||
                        (y + heigth / 2 > r.getY() - r.getHeigth())) &&
                (getDistance(y, r.getY()) < heigth / 2 + r.getHeigth() / 2) &&
                (getDistance(x, r.getX()) < width / 2 + r.getWidth() / 2);
    }
    private  double getDistance(double p1, double p2) {
        return Math.sqrt(Math.pow(p2 - p1, 2));
  }

}
