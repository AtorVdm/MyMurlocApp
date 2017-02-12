package com.vdm.mymurloc;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.io.IOException;
import java.util.Random;

/**
 * Created by Ator on 11/02/17.
 */

public class ButtonUtils {
    private static final int BUTTONS_IN_ROW = 3;
    private Context mContext;
    private int width, height;

    public ButtonUtils(Context context, int width, int height) {
        mContext = context;
        this.width = width;
        this.height = height;
    }

    public Button aggroButton() {
        return basicButton(R.raw.murloc_aggro);
    }

    public Button attackButton() {
        return basicButton(R.raw.murloc_attack_1, R.raw.murloc_attack_2, R.raw.murloc_attack_3);
    }

    public Button alertButton() {
        return basicButton(R.raw.murloc_alert);
    }

    public Button fidgetButton() {
        return basicButton(R.raw.murloc_fidget_1, R.raw.murloc_fidget_2, R.raw.murloc_fidget_3);
    }

    public Button woundButton() {
        return basicButton(R.raw.murloc_wound_1, R.raw.murloc_wound_2, R.raw.murloc_wound_3, R.raw.murloc_wound_4);
    }

    public Button deathButton() {
        return basicButton(R.raw.murloc_death);
    }

    private Button basicButton(final int... soundResources) {
        Button button = new Button(mContext);
        button.setLayoutParams(new GridView.LayoutParams(GridView.LayoutParams.MATCH_PARENT, height / BUTTONS_IN_ROW));
        button.setBackgroundColor(Color.TRANSPARENT);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(mContext, soundResources[new Random().nextInt(soundResources.length)]);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mediaPlayer.release();
                    }
                });
            }
        });
        return button;
    }
}
