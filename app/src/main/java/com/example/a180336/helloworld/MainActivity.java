package com.example.a180336.helloworld;

import android.content.Intent;
import android.content.res.Resources;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private View viewById;
    private String[] stringArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewById = findViewById(R.id.button1);

        Resources r =getResources();
        stringArray = r.getStringArray(R.array.city);


        viewById.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,stringArray[0],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onStart() {
        Log.e("MainActivity", "onstart()调用");
        super.onStart();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.e("MainActivity", "onRestoreInstanceState()调用");
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onResume() {
        Log.e("MainActivity", "onResume()调用");
        super.onResume();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Log.e("MainActivity", "onSaveInstanceState()调用");
        super.onSaveInstanceState(outState, outPersistentState);
    }


    @Override
    protected void onPause() {
        Log.e("MainActivity", "onPause()调用");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("MainActivity", "onStop()调用");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("MainActivity", "onDestroy()调用");
        super.onDestroy();
    }
}
