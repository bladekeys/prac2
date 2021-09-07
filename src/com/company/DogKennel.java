package com.company;

import java.util.ArrayList;

public class DogKennel {
    private String dname;
    private ArrayList<String> dogs;

    public DogKennel() {
        dogs = new ArrayList<>();
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public ArrayList<String> getDogs() {
        return dogs;
    }

    public ArrayList<String> addDogs() {
        dogs.add(dname);
        return dogs;
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "dogs=" + dogs +
                '}';
    }
}
