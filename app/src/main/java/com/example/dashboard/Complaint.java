package com.example.dashboard;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Complaint extends AppCompatActivity {
    EditText emailFT,passwordFT,nameFT,userNameFT,phoneFT;

    Button registerBtn;

    FirebaseAuth auth;

    FirebaseDatabase database;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);

        emailFT = findViewById(R.id.emailFT);
        passwordFT = findViewById(R.id.passwordFT);
        nameFT = findViewById(R.id.nameFT);
        userNameFT = findViewById(R.id.userNameFT);
        phoneFT = findViewById(R.id.phoneFT);

        registerBtn = findViewById(R.id.registerBtn);

        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailFT.getText().toString(), password = passwordFT.getText().toString();
                auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            User user = new User(nameFT.getText().toString(),userNameFT.getText().toString(),email,phoneFT.getText().toString(),password);
                            String id = task.getResult().getUser().getUid();
                            database.getReference().child("Complaint").child(id).setValue(user);
                            Intent intent = new Intent(Complaint.this,MainActivity.class);
                            startActivity(intent);
                            Toast.makeText(Complaint.this, "Complaint Registered", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(Complaint.this, "Error while registering", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });

    }
}