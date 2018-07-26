package com.example.ina97.prac_picasso;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Transformation;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ProgressBar progressBar = (ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);

        String url = "http://square.github.io/picasso/static/sample.png";
        ImageView img_picasso = (ImageView)findViewById(R.id.img);
        Picasso.with(this)
                .load(url)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher_round)
                .into(img_picasso, new ImageLoadedCallback(progressBar){
                    public void onSuccess(){
                        if(this.progressBar!=null){
                            this.progressBar.setVisibility(View.GONE);
                        }
                    }
                });
    }

    private class ImageLoadedCallback implements Callback{
        ProgressBar progressBar;
        public ImageLoadedCallback(ProgressBar progBar){
            progressBar=progBar;
        }

        @Override
        public void onSuccess() {

        }

        @Override
        public void onError() {

        }
    }
}
