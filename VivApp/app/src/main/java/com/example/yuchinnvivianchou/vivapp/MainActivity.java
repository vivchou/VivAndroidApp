package com.example.yuchinnvivianchou.vivapp;

import android.net.Uri;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.server.converter.StringToIntConverter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initializing button
        Button button = (Button) findViewById(R.id.button);
        //initializing listview

        ListView ListView = (ListView) findViewById(R.id.listview);
        final EditText editText = (EditText) findViewById(R.id.edittext);

        //make an arraylist to store our data
        final ArrayList<String> myItems = new ArrayList<>();

        //make an arrayadapter
        //this connects out listview to our ArrayList of Data
        final ArrayAdapter<String> myAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,myItems);
        ListView.setAdapter(myAdapter);



        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String currentItem = editText.getText().toString();
                //add it to the ArrayList
                myItems.add(currentItem);
                //update adapter
                myAdapter.notifyDataSetChanged();
                //cleatEditText
                editText.setText("");
                Toast.makeText(MainActivity.this, "Poof", Toast.LENGTH_LONG).show();
            }

        });
        //GET THE EDITTEXT INPUT AS A STING


    }




}


