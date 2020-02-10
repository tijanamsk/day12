package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // posto je konstruktor private ne mozemo vise tako da instanciramo objekat
        //Employee employee = new Employee("Pera Peric", 232423432, 6, 1500);
        //Employee apprentice = new Employee("Jovan Jovanovic", 23234444, 0, 300);

        // with static factory method
        Employee senior = Employee.createNewSenior("Mika Mikic", 434234, 10, 2000);
        Employee junior = Employee.createNewApprentice("Laza Lazic", 3423423);

        System.out.println(senior);
        System.out.println(junior);
    }
}
