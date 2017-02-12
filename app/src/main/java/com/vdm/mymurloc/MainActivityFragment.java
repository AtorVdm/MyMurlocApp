package com.vdm.mymurloc;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.murloc);
        final GridView gridView = (GridView) view.findViewById(R.id.gridView);
        view.post(new Runnable() {
            @Override
            public void run() {
                gridView.setAdapter(new ImageAdapter(getActivity(), view.getWidth(), view.getHeight()));
            }
        });
        super.onViewCreated(view, savedInstanceState);
    }
}
