package com.example.a7july_icard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Person> PersonList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inItVIews();
        BuildData();
        setDatatoAdaptor();
    }


    private void inItVIews() {
        recyclerView = findViewById(R.id.recyclerview);
    }

    private void BuildData() {
        for (int i = 0; i < 3; i++) {
            PersonList.add(new Person("Age: 64", R.drawable.bill_gates, "MicroSoft", "Profession: Business"));
            PersonList.add(new Person("Age: 54", R.drawable.jefff, "Amazon", "Profession: Business"));
            PersonList.add(new Person("Age: 31", R.drawable.prateekkk, "MasaiSchool", "Profession: Business"));
        }
    }


    private void setDatatoAdaptor() {
        PersonAdapter personAdapter = new PersonAdapter(PersonList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(personAdapter);
    }


}