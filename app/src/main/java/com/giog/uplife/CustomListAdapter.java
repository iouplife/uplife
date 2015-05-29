package com.giog.uplife;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomListAdapter extends BaseAdapter {

	private List<ListItem> list;
	private Context context;

	public CustomListAdapter(List<ListItem> list, Context context) {
		this.list = list;
		this.context = context;
	}


    @Override
    public int getCount() {
        return list != null ? list.size() : 0;
    }

    @Override
    public ListItem getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater infalInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = infalInflater.inflate(R.layout.item_list, null);
        }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        TextView tvParceiro = (TextView) convertView.findViewById(R.id.tvParceiro);
        TextView tvDate = (TextView) convertView.findViewById(R.id.tvDate);
        TextView tvDescription = (TextView) convertView.findViewById(R.id.tvDescription);

        ListItem item = list.get(position);

        if(item.getImageId() <= 0){
            imageView.setVisibility(View.GONE);
        } else {
            imageView.setImageResource(item.getImageId());
        }
        tvTitle.setText(item.getTitle());
        if(item.getDate().equals("")){
            tvDate.setVisibility(View.GONE);
        } else {
            tvDate.setText(item.getDate());
        }
        if(item.isParceiro()){
            tvParceiro.setVisibility(View.VISIBLE);
        }
        tvDescription.setText(item.getDescription());

        return convertView;
    }
}
