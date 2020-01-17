package com.materialdesigntips;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AppCompatButton raisedButton;
    AppCompatButton flatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        raisedButton = (AppCompatButton) findViewById(R.id.raised_btn);
        flatButton = (AppCompatButton) findViewById(R.id.flat_btn);

        raisedButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Raised Button",Toast.LENGTH_SHORT).show();
            }
        });

        flatButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"Flat Button",Toast.LENGTH_SHORT).show();
            }
        });

    }
}