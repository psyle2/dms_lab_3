package com.COMP2013;

public class Admin extends Employee {

    public Admin(String name) {
        setEmployeeName(name);
    }

    @Override
    public int calculateChristmasBonus() {
        return (int) (this.getSalary() * 0.08+100);
    }
}
