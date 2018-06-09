package com.example.davidr.proyectercergrado.Descripcion.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.davidr.proyectercergrado.Descripcion.model.Descripcion;
import com.example.davidr.proyectercergrado.Places.adapter.PlaceAdapter;
import com.example.davidr.proyectercergrado.Places.model.Place;
import com.example.davidr.proyectercergrado.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class DescripcionAdapter extends RecyclerView.Adapter {

    List<Descripcion> descripcionList;
    Context context;

    public DescripcionAdapter(List<Descripcion> descripcionList, Context context){
        this.descripcionList = descripcionList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_favorite, parent, false);
        return new ViewHolderDescripcion(item);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Descripcion object = descripcionList.get(position);
        ViewHolderDescripcion viewHolderDescripcion = (ViewHolderDescripcion) holder;

        viewHolderDescripcion.textViewDescTitle.setText(object.getTitle());
        Picasso.get().load(object.getImg()).into(viewHolderDescripcion.imageViewDesc);

    }

    @Override
    public int getItemCount() {
        return   descripcionList.size();
    }

    public class ViewHolderDescripcion extends RecyclerView.ViewHolder{

        TextView textViewDescTitle;
        ImageView imageViewDesc;


        public ViewHolderDescripcion(View item) {
            super(item);

            textViewDescTitle = item.findViewById(R.id.txv_favorite);
            imageViewDesc = item.findViewById(R.id.iv_favorite);

        }
    }
}
