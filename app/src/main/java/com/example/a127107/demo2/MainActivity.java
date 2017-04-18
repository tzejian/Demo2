package com.example.a127107.demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get button and set onclicklistener
        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText etName = (EditText) findViewById(R.id.editText);
                EditText etAge = (EditText) findViewById(R.id.editText2);
                //put name and age into the array
                String[] info = {etName.getText().toString(),etAge.getText().toString()};
                //create intent to another activites
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                //pass the string array
                i.putExtra("info",info);
                //start
                startActivity(i);
            }
        });

    }
}
