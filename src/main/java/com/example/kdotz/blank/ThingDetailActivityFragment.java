package com.example.kdotz.blank;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class ThingDetailActivityFragment extends Fragment {

    public ThingDetailActivityFragment() {
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_thing_detail, container, false);

        Intent intent = getActivity().getIntent();

        String item = intent.getStringExtra("item");

        TextView thingDetailTextView = (TextView) rootView.findViewById(R.id.detail_text);
        thingDetailTextView.setText(item);

        return rootView;

    }

}































