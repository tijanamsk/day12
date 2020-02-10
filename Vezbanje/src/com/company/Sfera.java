package com.company;

public class Sfera extends Oblik {

    private double r;

    public Sfera(String boja, double r) {
        super(boja);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double povrsina(){
        return 4*(Math.pow(r,2.0))*Math.PI;
    }
    public double zapremina(){
        return (4/3)*(Math.pow(r,3.0))*Math.PI;
    }

    @Override
    public String toString() {
        return "Sfera{ Boja="+ this.getBoja()+
                "r=" + r +
                '}';
    }
}
