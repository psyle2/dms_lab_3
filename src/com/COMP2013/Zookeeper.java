package com.COMP2013;

public class Zookeeper extends Employee {

    public Zookeeper(String name) {
        setEmployeeName(name);
    }

    @Override
    public int calculateChristmasBonus() {
        return (int) (this.getSalary() * 0.05+100);
    }
}
