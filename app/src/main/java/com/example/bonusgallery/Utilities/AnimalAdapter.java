package com.example.bonusgallery.Utilities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bonusgallery.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {

    private Context context;
    private String[] animals;
    private int layout;


    public AnimalAdapter(Context context, String[] animals, int layout) {
        this.context = context;
        this.animals = animals;
        this.layout = layout;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        Picasso.with(context).load(animals[position]).fit().placeholder(R.drawable.spinner).into(holder.imageAnimalito, new Callback() {
            @Override
            public void onSuccess() {
                //holder.image.setVisibility(View.INVISIBLE);
            }

            @Override
            public void onError() {
                Toast.makeText(context, "Error!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return animals.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageAnimalito;

        public ViewHolder(View itemView) {
            super(itemView);
            this.imageAnimalito = itemView.findViewById(R.id.imageViewLayout);
        }

    }
}