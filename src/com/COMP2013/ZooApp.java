package com.COMP2013;

public class ZooApp {
    public static void main(String[] args) {
        Zoo london_zoo = new Zoo("London", 45);
        Zoo tokyo_zoo = new Zoo("Tokyo", 20);
        Zoo paris_zoo = new Zoo("Paris", 30);
        Zoo nyc_zoo = new Zoo("New York", 52);
        Zoo sydney_zoo = new Zoo("Sydney", 18);
        ZooCorp megaZoo = new ZooCorp();
        megaZoo.addZoo(london_zoo);
        System.out.println(london_zoo.printInfo());
        System.out.println(tokyo_zoo.printInfo());
        System.out.println(paris_zoo.printInfo());
        System.out.println(nyc_zoo.printInfo());
        System.out.println(sydney_zoo.printInfo());

        System.out.println("Total number of zoos created:\t" + Zoo.zooCount);

        london_zoo.buildNewCompound();
        System.out.println(london_zoo.printInfo());

        Employee sue = new Zookeeper("Sue");
        Employee bob = new Admin("Bob");
        megaZoo.addEmployee(sue);
        megaZoo.addEmployee(bob);

        System.out.println(sue.getClass().getSimpleName()+":"+sue.getEmployeeName()+":"+sue.calculateChristmasBonus());
        System.out.println(bob.getClass().getSimpleName()+":"+bob.getEmployeeName()+":"+bob.calculateChristmasBonus());



    }
}
