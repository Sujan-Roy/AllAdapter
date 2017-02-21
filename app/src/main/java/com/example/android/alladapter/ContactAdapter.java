package com.example.android.alladapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Android on 2/21/2017.
 */

public class ContactAdapter extends ArrayAdapter{
    private  Contact contact;
    private Context context;
    private ArrayList<Contact> contactList;

    TextView nameTv,phoneTv;
    public ContactAdapter(Context context,ArrayList<Contact>contactList) {
        super(context,R.layout.single_row,contactList);
        this.contactList=contactList;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, View view, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view= inflater.inflate(R.layout.single_row,parent,false);

        nameTv= (TextView) view.findViewById(R.id.name);
        phoneTv= (TextView) view.findViewById(R.id.phone);

        contact= contactList.get(position);
        nameTv.setText(contact.getName());
        phoneTv.setText(contact.getPhone());

        return view;

    }
}
