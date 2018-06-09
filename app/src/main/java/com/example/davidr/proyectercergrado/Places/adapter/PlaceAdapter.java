package com.example.davidr.proyectercergrado.Places.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.davidr.proyectercergrado.R;
import com.example.davidr.proyectercergrado.Places.model.Place;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter {

    List<Place> placeList;
    Context context;

    public PlaceAdapter(List<Place> placeList, Context context){
        this.placeList = placeList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_place, parent, false);
        return new ViewHolderPlace(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Place object = placeList.get(position);
        ViewHolderPlace viewHolderPlace = (ViewHolderPlace) holder;
        viewHolderPlace.textViewPlaceTitle.setText(object.getTitle());
        Picasso.get().load(object.getImg()).into(viewHolderPlace.imageViewPlaceimg);

    }

    @Override
    public int getItemCount() {
        return placeList.size();
    }

    public class ViewHolderPlace extends RecyclerView.ViewHolder{

        TextView textViewPlaceTitle;
        ImageView imageViewPlaceimg;

        public ViewHolderPlace(View item) {
            super(item);
            textViewPlaceTitle = item.findViewById(R.id.txv_placename);
            imageViewPlaceimg = item.findViewById(R.id.iv_placeimage);
        }
    }
}
