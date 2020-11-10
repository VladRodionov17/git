
package com.example.git_loading;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText telephoneInput;
    public EditText passwordInput;
    public TextView textBlock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        telephoneInput = (EditText) findViewById(R.id.phone);
        passwordInput = (EditText) findViewById(R.id.password);
        textBlock = (TextView) findViewById(R.id.textBlock);
    }


    public void onClick(View view) {
        if (telephoneInput.getText().toString().equals("") && passwordInput.getText().toString().equals("")) {
            Toast.makeText(getApplicationContext(), "Какая-то из строк не заполнена!", Toast.LENGTH_SHORT).show();
        } else {

            Intent intent = new Intent(MainActivity.this, perehod.class);
            startActivity(intent);
        }
    }
}
