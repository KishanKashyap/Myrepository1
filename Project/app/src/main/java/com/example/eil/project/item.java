package com.example.eil.project;

/**
 * Created by EIL on 29-01-2017.
 */

public class item {
    public String name;
    public  String  number;
    public  int flat;

    public item(String name, String  number, int flat) {
        this.name = name;
        this.number = number;
        this.flat = flat;
    }



    public int getFlat() {
        return flat;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setFlat(int flat) {
        this.flat = flat;
    }

}
