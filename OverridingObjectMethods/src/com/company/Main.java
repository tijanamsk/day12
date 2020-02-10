package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Point p1=new Point(2,5);
        System.out.println(p1); // ovde se poziva metoda toString default dobijamo ime klase i hashCode
        //kada pregazimo nasom metodom toString ispisace
        Point p2=new Point(2,5);
        if(p1.equals(p2)){
            System.out.println("P1 and P2 are same");
        }else{
            System.out.println("not same");
        }
        Point p3=p1;
        if(p1.equals(p3)){
            System.out.println("P1 and P3 are same");
        }else{
            System.out.println("not same");

        }

    }
}
