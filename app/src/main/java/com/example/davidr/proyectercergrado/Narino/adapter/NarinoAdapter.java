package com.example.davidr.proyectercergrado.Narino.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.davidr.proyectercergrado.Narino.model.Narino;
import com.example.davidr.proyectercergrado.Parques.adapter.ParqueAdapter;
import com.example.davidr.proyectercergrado.Places.adapter.PlaceAdapter;
import com.example.davidr.proyectercergrado.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NarinoAdapter extends RecyclerView.Adapter {


    List<Narino> narinoList;
    Context context;

    public NarinoAdapter(List<Narino> narinoList, Context context) {
        this.narinoList = narinoList;
        this.context = context;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_narino, parent, false);
        return new ViewHolderNarino(item);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Narino object = narinoList.get(position);
        ViewHolderNarino viewHolderNarino= (ViewHolderNarino) holder;
        viewHolderNarino.textViewEtiq.setText(object.getEtiq());
        viewHolderNarino.textViewLema.setText(object.getLema());
        viewHolderNarino.textViewDescri.setText(object.getDescrip());
        Picasso.get().load(object.getImagescud()).into(viewHolderNarino.imageViewEscu);
        Picasso.get().load(object.getImgband()).into(viewHolderNarino.imageViewBand);
    }

    @Override
    public int getItemCount() {
        return narinoList.size();
    }


    public class ViewHolderNarino extends RecyclerView.ViewHolder{

        TextView textViewEtiq, textViewLema,textViewDescri;
        ImageView imageViewEscu, imageViewBand;

        public ViewHolderNarino(View item) {
            super(item);
            textViewEtiq = item.findViewById(R.id.txv_titulo_narino);
            textViewLema = item.findViewById(R.id.txv_lema);
            textViewDescri = item.findViewById(R.id.txv_descrip_narino);
            imageViewBand = item.findViewById(R.id.iv_bandera);
            imageViewEscu = item.findViewById(R.id.iv_escudo);
        }
    }
}
