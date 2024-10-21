package com.COMP2013;

public abstract class Animal implements Maintainable{
    private String name;

    public Animal(String name) { this.name = name; }



    public abstract void eat();

    public void enjoy() { System.out.println(this.getClass().getSimpleName()+" enjoys life at the zoo!"); }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public void maintain() {
        System.out.println(this.getClass().getSimpleName()+" maintains the animal");
    }
}
