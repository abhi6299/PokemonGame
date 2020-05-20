package com.example.pokemongame;

import android.location.Location;

/**
 * Created by hussienalrubaye on 5/8/17.
 */

public class Pockemon {
    public int Image;
    public  String name;
    public  String des;//destination
    public  double power;
    public  boolean isCatch;//is Pokemon Catched or not?
    public Location location;//location of the pokemon

    Pockemon(int Image,String name,String des,double power, double lat, double lag){
        this.Image=Image;
        this.name=name;
        this.des=des;
        this.power=power;
        this.isCatch=false;
        location= new Location(name);
        location.setLongitude(lag);
        location.setLatitude(lat);

    }
}
