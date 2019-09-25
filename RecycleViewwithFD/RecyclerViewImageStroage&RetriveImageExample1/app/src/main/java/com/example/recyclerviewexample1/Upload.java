package com.example.recyclerviewexample1;

import android.util.Log;

public class Upload {
    private static final String TAG = "Upload";
    private  String name;
    private  String imageUrl;


    public Upload() {
        //empty constructor needed
    }

    public Upload(String name, String imageUrl) {

        this.name=name;
        this.imageUrl=imageUrl;
        Log.d( TAG, "Uploadname: "+this.name );
        Log.d( TAG, "Uploadimageurl: "+this.imageUrl );

    }
    public String getName() {
        Log.d( TAG, "getName: "+name);
        return name;

    }

    public void setName(String name) {

        this.name = name;
        Log.d( TAG, "setName: "+ this.name );
    }

    public String getImageUrl() {

        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {

        this.imageUrl = imageUrl;
    }



}