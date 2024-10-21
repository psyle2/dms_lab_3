package com.COMP2013;

import java.util.ArrayList;

public class ZooCorp {
    public ArrayList<Zoo> zoosArray;
    public ArrayList<Employee> employeesArray;

    public ZooCorp() {
        zoosArray = new ArrayList<Zoo>();
        employeesArray = new ArrayList<Employee>();
    }

    public ZooCorp(Zoo ownedZoo) {
        zoosArray = new ArrayList<Zoo>();
        zoosArray.add(ownedZoo);
        employeesArray = new ArrayList<Employee>();
    }

    public void addZoo(Zoo zoo) {
        this.zoosArray.add(zoo);
    }

    public void addEmployee(Employee employee) { employeesArray.add(employee); }
}
