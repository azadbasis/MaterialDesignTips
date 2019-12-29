package com.materialdesigntips;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.item1_id){
            Toast.makeText(this, "item 1", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.item2_id){
            Toast.makeText(this, "item 2", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.item3_id){
            Toast.makeText(this, "item 3", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.cart_id){
            Toast.makeText(this, "cart", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.search_id){
            Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
        }else if(id==android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
