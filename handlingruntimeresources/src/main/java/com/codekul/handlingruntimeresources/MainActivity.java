package com.codekul.handlingruntimeresources;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void onConfigurationChanged(Configuration newconfig){
        super.onConfigurationChanged(newconfig);


        if(newconfig.orientation ==Configuration.ORIENTATION_LANDSCAPE){
            ((ImageView)findViewById(R.id.imgvw)).setImageResource(R.drawable.ic_alarm_clock);
        }
        else if(newconfig.orientation==Configuration.ORIENTATION_PORTRAIT) {
            ((ImageView) findViewById(R.id.imgvw)).setImageResource(R.drawable.ic_apple);
        }
        else {
            ((ImageView)findViewById(R.id.imgvw)).setImageResource(R.drawable.ic_launcher_background);
        }

    }

}
