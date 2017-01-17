package com.uniquestudio.materialcheckbox;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.uniquestudio.library.CircleCheckBox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    CircleCheckBox checkBox;
    ListView lv;
    private CustomAdapter adapter;
    ArrayList<String> _jobsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _jobsList.clear();
        _jobsList.add("salam");
        _jobsList.add("alaik");
        _jobsList.add("shoma");

        lv = (ListView)findViewById(R.id.lv);
        adapter = new CustomAdapter(this, _jobsList);
        lv.setAdapter(adapter);

//        checkBox = (CircleCheckBox) findViewById(R.id.circle_check_box);
//        checkBox.setListener(new CircleCheckBox.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(boolean isChecked) {
//                // do something
//            }
//        });
    }
}
