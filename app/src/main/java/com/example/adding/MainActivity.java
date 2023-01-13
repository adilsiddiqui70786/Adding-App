package com.example.adding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1 , num2;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.Edittext1);
        num2 = findViewById(R.id.Edittext2);
        add = findViewById(R.id.Button);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Integer p = Integer.parseInt(num1.getText().toString());
                    Integer m = Integer.parseInt(num2.getText().toString());
                    Integer a = p + m;

                    Toast.makeText(MainActivity.this, "Addition = " + a, Toast.LENGTH_SHORT).show();

                }
            });

    }


}