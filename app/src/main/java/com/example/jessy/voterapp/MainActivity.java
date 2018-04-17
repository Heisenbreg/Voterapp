package com.example.jessy.voterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.View;
import android.view.View;
import android.widget.ArrayAdapter;
//import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;
//import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView) findViewById(R.id.lv_vote);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);
    }

    public void toastMsg(String msg) {
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void disToastmsg(View v) {
        toastMsg("Your Vote is casted");
    }

}