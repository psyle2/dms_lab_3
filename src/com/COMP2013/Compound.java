package com.COMP2013;

import java.util.ArrayList;

public class Compound {
    private int animalCount;
    private ArrayList<Animal> animals;

    public Compound() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        animals.add(a);
        animalCount++;
    }

    public void printAnimals() {
        System.out.println("There are "+animalCount+" animals in this compound.");
    }
}
