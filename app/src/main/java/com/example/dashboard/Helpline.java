package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Helpline extends AppCompatActivity {

    EditText etNumber;
    ImageButton btcall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);
        etNumber= findViewById(R.id.et_number);
        btcall= findViewById(R.id.bt_call);

        btcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phone =etNumber.getText().toString();
                if (phone.isEmpty()){
                    Toast.makeText(Helpline.this, "Please Enter a desired helpline for quicker assistance", Toast.LENGTH_SHORT).show();
                } else{
                    String s= "tel:"+phone;
                    Intent intent= new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse(s));
                    startActivity(intent);
                }
            }
        });
    }
}