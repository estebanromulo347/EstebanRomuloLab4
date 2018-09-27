package com.esteban.romulo;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("estebanromulo","onCreate has executed...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("start","onStart has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("resume","onResume has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("pause","onPause has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("stop","onStop has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("restart","onRestart has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("destroy","onDestroy has executed...");
    }

    public void showMessage(View v){
        Toast.makeText(this,"Going back...",Toast.LENGTH_LONG).show();
    }

    public void showMessageSnack(View v){
        Snackbar.make(v,"Finding next tourist destination...",Snackbar.LENGTH_LONG).show();
    }}
