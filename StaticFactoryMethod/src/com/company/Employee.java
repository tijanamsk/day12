package com.company;

public class Employee {
    private final  static double APPRENTICE_SALARY = 300;

    private String name;
    private long id;
    private int yearsOfExperience;
    private double salary;

    private Employee(String name, long id, int yearsOfExperience, double salary) {
        this.name = name;
        this.id = id;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public static Employee createNewApprentice(String name, long id){
        return new Employee(name,id,0,APPRENTICE_SALARY);

    }

    public static Employee createNewSenior(String name, long id, int yearsOfExperience, double salary){
        return new Employee(name, id, yearsOfExperience, salary);
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                '}';
    }
}
