package com.vincler.jf.exercisesoop;

import android.util.Log;

public class Car {
    String name;
    String color;
    int kilometers;
    CarBrand brand;

    Car(String pName, String pColor, int pKilometers, CarBrand pBrand){
        name=pName;
        color=pColor;
        kilometers=pKilometers;
        brand=pBrand;
    }

    public void Start() {
        Log.i(name,"vroom");
    }

}


