package com.example.sec.sep12;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void NextScene(View aaa){

        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);

        Toast toast= Toast.makeText(getApplicationContext(), "지민이 박물관에 온 걸 환영해", Toast.LENGTH_LONG) ;
        toast.show();
    }


}
