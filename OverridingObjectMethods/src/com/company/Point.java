package com.company;

public class Point {
    private double x,y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    // ovde ako ne napisemo equals i toString imamo defaultan equals i toString
    public String toString(){    // sada smo pregazili
        return "(" + this.x+ "," + this.y+ ")";
    }
    public boolean equals(Object other){ //varijanta koju smo dobili iz klase Object
        if(other==null || !(other instanceof Point)) // prvo proverava da li je null jer ne moze nikako da bude null cim moze da se pozove metoda equals
            return false;
       Point otherPoint= (Point) other;
       if(this.x==otherPoint.x && this.y==otherPoint.y){
           return true;
       }else{
           return false;
       }

    }


}
