package com.example.igov.pop.MainMenu;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

/**
 * Created by Keerthi Suresh on 23-03-2016.
 */

import com.example.igov.pop.R;
import com.example.igov.pop.MainMenu.education.scholarships;

public class education extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_education,container,false);




    }

    public void OnClickTileview (View v){

        int id = v.getId();
        Fragment fragment = new scholarships();

        if (id == R.id.image_scholar)
            fragment = new scholarships();

        RelativeLayout relativeLayout = (RelativeLayout) v.findViewById(R.id.relativeLayout);

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.relativeLayout, fragment).addToBackStack(null).commit();
    }


}
