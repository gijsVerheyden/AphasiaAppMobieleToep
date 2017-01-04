package com.example.gijs.aphasiaappmobiele;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.List;

public class Test2Activity extends AppCompatActivity {
    private ListView pictures;
    private List<Integer> picturesID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);
        pictures = (ListView) findViewById(R.id.image_list);
        pictures.setAdapter(new PictureListAdapter(Test2Activity.this,picturesID));
    }
}