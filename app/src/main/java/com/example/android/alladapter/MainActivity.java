package com.example.android.alladapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText etName,etPhone;
    Button btnAdd;
    ListView listView;
    String  name,phone;

    Contact contact;
    ContactAdapter adapter;

    ArrayList<Contact> contactList;
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName= (EditText) findViewById(R.id.etName);
        etPhone= (EditText) findViewById(R.id.etPhone);
        btnAdd= (Button) findViewById(R.id.btnAdd);
        listView= (ListView) findViewById(R.id.listView);
        contactList= new ArrayList<>();
          adapter = new ContactAdapter(this,contactList);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name= etName.getText().toString();
                phone= etPhone.getText().toString();
                etName.getText().clear();
                etPhone.getText().clear();
                contact= new Contact();
                contact.setName(name);
                contact.setPhone(phone);
                contactList.add(contact);
                listView.setAdapter(adapter);

            }
        });
    }
}
