package com.example.ina97.prac_picasso;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        String url = "http://square.github.io/picasso/static/sample.png";
        ImageView img_picasso = (ImageView)findViewById(R.id.img);
        Picasso.with(this)
                .load(url)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher_round)
                .into(img_picasso);
    }
}
