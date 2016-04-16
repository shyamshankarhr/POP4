package com.example.igov.pop;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Keerthi Suresh on 23-03-2016.
 */
public class settings extends Fragment {

    String[] keys = {
            "Night Mode",
            "Notifications",
            "Text Size",
            "Privacy Policy"
            } ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,keys);
        View v = inflater.inflate(R.layout.fragment_settings, container,false);
        ListView list = (ListView)v.findViewById(R.id.settingslist);

        list.setAdapter(adapter);
        return v;
    }
}
