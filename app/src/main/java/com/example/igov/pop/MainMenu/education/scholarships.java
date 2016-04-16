package com.example.igov.pop.MainMenu.education;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.igov.pop.R;

/**
 * Created by Keerthi Suresh on 07-04-2016.
 */
public class scholarships extends Fragment{

    String[] keys = {
            "SCHOLARSHIP 1",
            "SCHOLARSHIP 1",
            "SCHOLARSHIP 1",
            "SCHOLARSHIP 1"
    } ;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        ArrayAdapter<String> adapter = new
                ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,keys);
        View v = inflater.inflate(R.layout.fragment_scholarships, container,false);
        ListView list = (ListView)v.findViewById(R.id.scholarlist);

        list.setAdapter(adapter);
        return v;
    }



}
