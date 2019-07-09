package com.example.packbatch;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class PackAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<PackModel> packModelArrayList;

    public PackAdapter(Context context, ArrayList<PackModel> packModelArrayList) {

        this.context = context;
        this.packModelArrayList = packModelArrayList;
    }

    @Override
    public int getViewTypeCount() {
        return getCount();
    }
    @Override
    public int getItemViewType(int position) {

        return position;
    }

    @Override
    public int getCount() {
        return packModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return packModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.list_item, null, true);

            holder.tvOrderID = (TextView) convertView.findViewById(R.id.tvOrder_id);
            holder.tvPickBy = (TextView) convertView.findViewById(R.id.tvPickBy);
            holder.tvStatus = (TextView) convertView.findViewById(R.id.tvStatus);
            holder.tvPacked = (TextView) convertView.findViewById(R.id.tvPacked);

            convertView.setTag(holder);
        }else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = (ViewHolder)convertView.getTag();
        }

        holder.tvOrderID.setText(packModelArrayList.get(position).getOrderID());
        holder.tvPickBy.setText(String.valueOf(packModelArrayList.get(position).getPickby()));
        holder.tvStatus.setText(String.valueOf(packModelArrayList.get(position).getStatus()));
        holder.tvPacked.setText(String.valueOf(packModelArrayList.get(position).getPacked()));

        return convertView;
    }

    private class ViewHolder {

        protected TextView tvOrderID, tvPickBy, tvStatus, tvPacked;

    }

}