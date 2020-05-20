package com.example.pokemongame;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by hussienalrubaye on 5/8/17.
 */

public class MyLocationListener implements LocationListener {
    Context context;
    public static Location location;
    public MyLocationListener(Context context){
        this.context  =context ;
        location= new Location("Start");
        location.setLatitude(0);
        location.setLongitude(0);
    }
    public void onLocationChanged(Location location) {
        this.location=location;
    }// Whenever user location is updated

    public void onStatusChanged(String s, int i, Bundle b) {
        //  Toast.makeText(context, "Provider status changed",
        //         Toast.LENGTH_LONG).show();
    }// checks whenever the status of the gps changes i.e. enable or disable

    public void onProviderDisabled(String s) {
        Toast.makeText(context,
                "  GPS turned off . you cannot follow your locations",
                Toast.LENGTH_LONG).show();
    }// execute When GPS is disabled

    public void onProviderEnabled(String s) {
        // SettingSaved.LoadData(context);
        Toast.makeText(context,
                " GPS turned on. you can follow your locations",
                Toast.LENGTH_LONG).show();
    }// execute When GPS is enabled


}
