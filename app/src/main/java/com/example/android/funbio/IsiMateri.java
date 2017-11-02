package com.example.android.funbio;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IsiMateri extends AppCompatActivity {

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String>> listHashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_materi);

        Intent x = getIntent();
        ImageView image = (ImageView) findViewById(R.id.gambar);
        image.setImageResource(x.getExtras().getInt("imagess"));

        listView = (ExpandableListView) findViewById(R.id.list);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHashMap);
        listView.setAdapter(listAdapter);
    }

    private void initData(){
        Intent i = getIntent();
        String pengertian = i.getExtras().getString("pengertian");
        String klasifikasi = i.getExtras().getString("klasifikasi");
        String ciri2 = i.getExtras().getString("ciri2");
        listDataHeader = new ArrayList<>();
        listHashMap = new HashMap<>();

        listDataHeader.add("Pengertian");
        listDataHeader.add("Klasifikasi");
        listDataHeader.add("Ciri-Ciri");

        List<String> pengertianlist = new ArrayList<>();
        pengertianlist.add(pengertian);

        List<String> Klasifikasi = new ArrayList<>();
        Klasifikasi.add(klasifikasi);

        List<String> ciriciri = new ArrayList<>();
        ciriciri.add(ciri2);

        listHashMap.put(listDataHeader.get(0),pengertianlist);
        listHashMap.put(listDataHeader.get(1),Klasifikasi);
        listHashMap.put(listDataHeader.get(2),ciriciri);
    }
}
