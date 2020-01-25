package com.materialdesigntips;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup_id);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {

                switch (i) {

                    case R.id.RadioButton1_id:

                        Toast.makeText(getApplicationContext(),"RadioButton 1",Toast.LENGTH_LONG).show();

                        break;

                    case R.id.RadioButton2_id:

                        Toast.makeText(getApplicationContext(),"RadioButton 2",Toast.LENGTH_LONG).show();

                        break;

                }
            }
        });

    }
}
