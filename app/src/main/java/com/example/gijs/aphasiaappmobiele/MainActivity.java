package com.example.gijs.aphasiaappmobiele;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnTest1;
    private Button btnTest2;
    private Button btnTest3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        final Context context = this;
        btnTest1 = (Button) findViewById(R.id.btnTest1);
        btnTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Test1Activity.class);
                startActivity(intent);
            }
        });
        btnTest2 = (Button) findViewById(R.id.btnTest2);
        btnTest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Test2Activity.class);
                startActivity(intent);
            }
        });
        btnTest3 = (Button) findViewById(R.id.btnTest3);
        btnTest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(context, Test3Activity.class);
                startActivity(intent);
            }
        });

    }
}
