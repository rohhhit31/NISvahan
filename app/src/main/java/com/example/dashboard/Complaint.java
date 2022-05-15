package com.example.dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;

public class Complaint extends AppCompatActivity {


//    private ListView listView;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);

//        listView=findViewById(R.id.listview);
//        ArrayList<String> list= new ArrayList<>();
//        ArrayAdapter adapter= new ArrayAdapter<String>(this,R.layout.activity_complaint,list);
//        listView.setAdapter(adapter);
//
//        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("ONWERSHIP");
//        reference.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//                list.clear();
//                for(DataSnapshot snapshot: dataSnapshot.getChildren()){
//                    Information info = snapshot.getValue(Information.class);
//                    String txt =info.getColour() + ":" + info.getOwner() + ":" + info.getRegistered() + ":" + info.getResident() + ":" + info.getType() + ":" +info.getVehicle();
//                            list.add(txt);
//                }
//                adapter.notifyDataSetChanged();
//            }
//
//            @Override
//            public void onCancelled(@NonNull DatabaseError error) {
//
//            }
//        });

    }



    }
