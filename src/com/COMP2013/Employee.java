package com.COMP2013;

public abstract class Employee implements Employable{
    private int employeeID;
    private String employeeName;
    private int employeeSalary;


    @Override
    public void setEmployeeID(int number) {
        this.employeeID = number;
    }

    @Override
    public int getEmployeeID() {
        return this.employeeID;
    }

    @Override
    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    @Override
    public String getEmployeeName() {
        return this.employeeName;
    }

    @Override
    public int getSalary() {
        return this.employeeSalary;
    }

    @Override
    public void setSalary(int salary) {
        this.employeeSalary = salary;
    }
}
