package com.COMP2013;

import java.util.ArrayList;

public class Zoo {
    private String location;
    private int compoundCount;
    public static int zooCount = 0;
    private int zooID;
    private ArrayList<Compound> compounds;

    public Zoo(String location, int compoundCount) {
        this.setLocation(location);
        this.setCompoundCount(compoundCount);
        compounds = new ArrayList<Compound>();
        zooCount++;
        zooID = zooCount;
        for (int i = 0; i < compoundCount; i++) {
            addCompound(new Compound());
        }
    }

    private void addCompound(Compound compound) {
        this.compounds.add(compound);
    }

    private void setCompoundCount(int compoundCount) {
        this.compoundCount = compoundCount;
    }

    public Zoo() {
        this.setLocation("");
        this.compoundCount = 30;
        zooCount++;
        zooID = zooCount;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void buildNewCompound() {
        this.compoundCount++;
    }

    public String printInfo() {
        return location + "\t" + compoundCount;
    }

    public int getZooID() {
        return zooID;
    }
}
