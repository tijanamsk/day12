package com.company;

public class Kvadar extends Oblik {
    private double a;
    private double b;
    private double c;

    public Kvadar(String boja, double a, double b, double c) {
        super(boja);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double povrsina(){
        return 2*(a*b+a*c+b*c);
    }
    public double zapremina(){
        return a*b*c;
    }

    @Override
    public String toString() {
        return "Kvadar{ Boja=" + this.getBoja()+
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
