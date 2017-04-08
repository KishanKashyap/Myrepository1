package com.example.eil.project;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by EIL on 29-01-2017.
 */

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {

    private List<item> itemListm;

    public adapter() {
        super();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  {
        public TextView name, number, flat;

        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.textview1);
            number = (TextView) view.findViewById(R.id.textView2);
            flat = (TextView) view.findViewById(R.id.textView3);

        }
    }


    public adapter(List<item> itemListm) {
        this.itemListm = itemListm;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        item Item = itemListm.get(position);
        holder.name.setText(Item.getName());
        holder.number.setText(Item.getNumber());
        holder.flat.setText(String.valueOf(Item.getFlat()));

    }

    @Override
    public int getItemCount() {
        return itemListm.size();
    }

}
