package com.example.eil.project;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EIL on 29-01-2017.
 */

public class directory extends AppCompatActivity {
    List<item> memberlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directory);

        memberlist=new ArrayList<>();

        item member1=new item("Mr. Goyal","8993578488",134);
        memberlist.add(member1);
        item member2=new item("Mr. Kumar","8935786787",634);
        memberlist.add(member2);
        item member3=new item("Mr. Bhatt","8993578458",874);
        memberlist.add(member3);
        item member4=new item("Mr. Jaiswal","9754378488",180);
        memberlist.add(member4);
        item member5=new item("Mr. Ramesh","823458488",898);
        memberlist.add(member5);
        item member6=new item("Mr. Ram","7789578488",444);
        memberlist.add(member6);
        item member7=new item("Mr. Garg","878978488",89);
        memberlist.add(member7);
        item member8=new item("Mr. Hiresh","8555578488",1);
        memberlist.add(member8);
        item member9=new item("Mr. Rana","01127668904",134);
        memberlist.add(member9);
        item member10=new item("Mr. Ghosh","6473578488",130);
        memberlist.add(member10);
        item member11=new item("Mr. John","9435797888",131);
        memberlist.add(member11);
        item member12=new item("Mrs. Kripali","897878488",134);
        memberlist.add(member12);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.view);
        adapter itemadapter=new adapter(memberlist);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(itemadapter);
        itemadapter.notifyDataSetChanged();


    }
}

