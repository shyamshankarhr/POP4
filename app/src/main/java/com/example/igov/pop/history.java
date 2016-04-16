package com.example.igov.pop;

import android.app.Activity;
import android.app.Fragment;
import android.app.ListActivity;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Keerthi Suresh on 23-03-2016.
 */

public class history extends Fragment {

    private CustomAdapter mAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        mAdapter = new CustomAdapter(getActivity());

        mAdapter.addSectionHeaderItem("Today , 6th April 2016");
        mAdapter.addItem("Item1");
        mAdapter.addItem("Item2");
        mAdapter.addItem("Item3");
        mAdapter.addItem("Item4");

        mAdapter.addSectionHeaderItem("Yesterday , 5th April 2016");
        mAdapter.addItem("Item1");
        mAdapter.addItem("Item2");
        mAdapter.addItem("Item3");
        mAdapter.addItem("Item4");

        mAdapter.addSectionHeaderItem("Rest");
        mAdapter.addItem("Item1");
        mAdapter.addItem("Item2");
        mAdapter.addItem("Item3");
        mAdapter.addItem("Item4");

        View v = inflater.inflate(R.layout.fragment_history, container,false);
        ListView list = (ListView)v.findViewById(R.id.histlist);

        list.setAdapter(mAdapter);
        return v;
    }
}

