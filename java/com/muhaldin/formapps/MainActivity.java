package com.muhaldin.formapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inputName = (EditText) findViewById(R.id.id_input_name);
        EditText inputEmail = (EditText) findViewById(R.id.id_input_email);
        EditText inputPhone = (EditText) findViewById(R.id.id_input_phone);
        EditText inputPassword = (EditText) findViewById(R.id.id_input_password);

        Button btnsave = (Button) findViewById(R.id.id_button_save);
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //kode untuk klik aksi dari button

                Log.d(tag "--Nama--", inputName.getText().toString());
                Log.d(tag "--Email--", inputEmail.getText().toString());
                Log.d(tag  "--Phone--", inputPhone.getText().toString());
                Log.d(tag "--Password--", inputPassword.getText().toString());
            }
        });
    }
}