package com.example.eil.project;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.net.URISyntaxException;
import java.util.ArrayList;

public class menu extends AppCompatActivity {
    ArrayList<title> menu;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tv=(TextView)findViewById(R.id.visit);
   tv.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          try {
              startActivity(Intent.parseUri("https://www.example.com",Intent.URI_INTENT_SCHEME));
          } catch (URISyntaxException e) {
              e.printStackTrace();
          }
      }
  });
        menu = new ArrayList<>();
        menu.add(new title("Office Address"));
        menu.add(new title("Public Notices"));
        menu.add(new title("Upcoming Society-Meetings"));
        menu.add(new title("Audit Reports"));
        menu.add(new title("Resolutions Passed in current and upcoming meetings"));
        menu.add(new title("MemberShip Details"));
        menu.add(new title("Management Committee"));
        menu.add(new title("Phone-Directory"));
        ListView lv=(ListView)findViewById(R.id.myview);
        menuadapter st = new menuadapter(menu,this);
        lv.setAdapter(st);

    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> st, View view, int pos, long l) {

        if(pos==7){
            Intent intent=new Intent(menu.this,directory.class);
            startActivity(intent);
        }
        if(pos==5){
            view.setEnabled(false);
        }



    }
});

    }
    class menuadapter extends BaseAdapter {
        private ArrayList<title> s=new ArrayList<>();

        private Context context;

        public menuadapter(ArrayList<title> s, Context context) {
            this.s = s;
            this.context = context;
        }

        @Override
        public int getCount() {
            return s.size();

        }

        @Override
        public Object getItem(int position) {
            return s.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater li=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            viewholder cv;
            if(convertView==null)

            {    cv=new viewholder();
                convertView = li.inflate(R.layout.tite, null);

                cv.title=(TextView)convertView.findViewById(R.id.textView4);
                convertView.setTag(cv);
            }
            else
                cv=(viewholder) convertView.getTag();
            title thistitle= (title) getItem(position);
            cv.title.setText(thistitle.getTitle());

            return convertView;
        }


    }
    static class viewholder {
        TextView title;
    }
}
