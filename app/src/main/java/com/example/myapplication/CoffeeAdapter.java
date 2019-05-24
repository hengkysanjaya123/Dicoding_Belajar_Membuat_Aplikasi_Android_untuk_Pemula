package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapplication.model.Coffee;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class CoffeeAdapter extends RecyclerView.Adapter<CoffeeAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Coffee> coffeeList;

    public CoffeeAdapter(Context mContext, ArrayList<Coffee> coffeeList) {
        this.mContext = mContext;
        this.coffeeList = coffeeList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.custom_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Coffee current = coffeeList.get(i);
        Glide.with(mContext)
                .load(current.getUrl())
                .apply(new RequestOptions().override(350, 550))
                .into(viewHolder.imageView);
        viewHolder.tvTitle.setText(current.getName());

        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        viewHolder.tvPrice.setText(format.format(current.getPrice()));
        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt = new Intent(mContext, Main2Activity.class);
                intt.putExtra("objCoffee", current);
                mContext.startActivity(intt);
            }
        });

        viewHolder.btnFavourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Favorite " + current.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        viewHolder.btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "Share " + current.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return coffeeList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView tvTitle;
        TextView tvPrice;
        CardView cardView;
        Button btnFavourite;
        Button btnShare;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            imageView = itemView.findViewById(R.id.img_item_photo);
            tvTitle = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            btnFavourite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}
