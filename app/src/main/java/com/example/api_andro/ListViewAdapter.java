package com.example.api_andro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<PlayerItem> {

    private List<PlayerItem> playerItemList;

    private Context context;

    public ListViewAdapter(List<PlayerItem> playerItemList, Context context) {
        super(context, R.layout.list_item, playerItemList);
        this.playerItemList = playerItemList;
        this.context = context;
    }



    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View listViewItem = inflater.inflate(R.layout.list_item, null, true);

        TextView textViewId = listViewItem.findViewById(R.id.id);
        TextView textViewName = listViewItem.findViewById(R.id.name);
        TextView textViewDescription = listViewItem.findViewById(R.id.description);
        TextView textViewPrice = listViewItem.findViewById(R.id.price);
        TextView textSlug = listViewItem.findViewById(R.id.slug);
        ImageView imgView = listViewItem.findViewById(R.id.Poster);


        PlayerItem playerItem = playerItemList.get(position);

        textViewId.setText(playerItem.getNo());
        textViewName.setText(playerItem.getName());
        textViewDescription.setText(playerItem.getDescription());
        textViewPrice.setText(playerItem.getPrice());
        textSlug.setText(playerItem.getSlug());
        Glide.with(context).load(playerItem.getPoster()).into(imgView);

        return listViewItem;
    }
}
