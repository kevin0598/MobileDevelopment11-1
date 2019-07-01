package com.example.asus.buatsound2;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

public class MainActivity extends Activity {
    MediaPlayer audiobackgorund;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        audiobackgorund=MediaPlayer.create(this,R.raw.lagu);
        audiobackgorund.setLooping(true);
        audiobackgorund.setVolume(1,1);
        audiobackgorund.start();
    }
}
