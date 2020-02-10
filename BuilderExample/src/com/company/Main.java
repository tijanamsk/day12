package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Computer computer=new Computer.ComputerBuilder("AMD","8 GB","1TE")
               .setGraphicCard(false)
               .setWifi(true)
               .build();

        System.out.println(computer);
    }
}
