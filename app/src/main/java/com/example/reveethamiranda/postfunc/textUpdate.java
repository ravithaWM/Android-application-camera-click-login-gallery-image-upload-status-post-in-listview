package com.example.reveethamiranda.postfunc;

/**
 * Created by Reveetha Miranda on 29-03-2018.
 */

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;


public class textUpdate extends ListActivity {


    ArrayList<String> list = new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.textupdate_activity);

        Button btn = (Button) findViewById(R.id.btnAdd);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);

        OnClickListener listener = new OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit = (EditText) findViewById(R.id.txtItem);
                list.add(edit.getText().toString());
                edit.setText("");
                adapter.notifyDataSetChanged();
            }
        };

        btn.setOnClickListener(listener);


        setListAdapter(adapter);
    }

}
