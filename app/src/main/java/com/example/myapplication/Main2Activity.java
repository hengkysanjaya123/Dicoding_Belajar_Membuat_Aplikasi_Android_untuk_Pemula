package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapplication.model.Coffee;

import java.text.NumberFormat;
import java.util.Locale;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.setTitle("Coffee Detail");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Coffee c = (Coffee) getIntent().getSerializableExtra("objCoffee");
        TextView tvName = findViewById(R.id.tvName);
        tvName.setText(c.getName());
        TextView tvPrice = findViewById(R.id.tvPrice);
//        NumberFormat formatter = new DecimalFormat("#,##");
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.ENGLISH);

        tvPrice.setText(format.format(c.getPrice()));
        TextView tvDesc = findViewById(R.id.tvDescription);
        tvDesc.setText(c.getDescription());

        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this)
                .load(c.getUrl())
                .apply(new RequestOptions().centerCrop())
                .into(imageView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
