package com.example.davidr.proyectercergrado.Parques.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.davidr.proyectercergrado.Parques.model.Parque;
import com.example.davidr.proyectercergrado.Places.adapter.PlaceAdapter;
import com.example.davidr.proyectercergrado.Places.model.Place;
import com.example.davidr.proyectercergrado.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ParqueAdapter extends RecyclerView.Adapter {


    List<Parque> parqueList;
    Context context;

    public ParqueAdapter(List<Parque> parqueList, Context context){
        this.parqueList = parqueList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_parque, parent, false);
        return new ViewHolderParque(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Parque object = parqueList.get(position);
        ViewHolderParque viewHolderParque = (ViewHolderParque) holder;
        viewHolderParque.textViewParqueTitle.setText(object.getTitle());
        viewHolderParque.textViewParqueDesc.setText(object.getDesc());
        Picasso.get().load(object.getImg()).into(viewHolderParque.imageViewParqueimg);

    }

    @Override
    public int getItemCount() {
        return parqueList.size();
    }

    public class ViewHolderParque extends RecyclerView.ViewHolder{

        TextView textViewParqueTitle;
        ImageView imageViewParqueimg;
        TextView textViewParqueDesc;

        public ViewHolderParque(View item) {
            super(item);
            textViewParqueTitle = item.findViewById(R.id.txv_parquename);
            imageViewParqueimg = item.findViewById(R.id.iv_parquename);
            textViewParqueDesc = item.findViewById(R.id.txv_descripcion_parque);
        }
    }
}
