package com.vdm.mymurloc;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
/**
 * Created by Ator on 11/02/17.
 */

public class ImageAdapter extends BaseAdapter {
    private ButtonUtils buttonUtils;

    public ImageAdapter(Activity activity, int width, int height) {
        buttonUtils = new ButtonUtils(activity, width, height);
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        switch (i) {
            case 0: return buttonUtils.aggroButton();
            case 1: return buttonUtils.attackButton();
            case 2: return buttonUtils.alertButton();
            case 3: return buttonUtils.fidgetButton();
            case 4: return buttonUtils.woundButton();
            case 5: return buttonUtils.deathButton();
            default: return null;
        }
    }
}
