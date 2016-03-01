package com.example.tere.estados;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // always call
        setContentView(R.layout.activity_main);
        Log.v("mensaje", "on Create");
    }

    public void onPause() {
        super.onPause();
        Log.v("mensaje", "on Pause");

    }

    /*public void onResume() {
        super.onPause(); // always call super
        if (myConnection == null) {
        myConnection = new ExampleConnect(); // init.resources
        myConnection.connect();
        Log.v("testing", "on Resume");
    }*/


    public void onStop() {
        super.onStop(); // always call super ...
        Log.v("mensaje", "on Stop");
    }

    public void onRestart() {
        super.onRestart();
        Log.v("mensaje", "on Restart");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.v("mensaje", "on Destroy");
    }
}


