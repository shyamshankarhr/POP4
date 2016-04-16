package com.example.igov.pop;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;

/**
 * Created by Keerthi Suresh on 23-03-2016.
 */
public class myDocs extends Fragment{

    ListView list;
        String[] web = {
            "Google Plus",
            "Twitter",
            "Windows",
            "Bing",
            "Itunes",
            "Wordpress",
            "Drupal"
    } ;
    Integer[] imageId = {
            R.drawable.my_documents,
            R.drawable.my_documents,
            R.drawable.my_documents,
            R.drawable.my_documents,
            R.drawable.my_documents,
            R.drawable.my_documents,
            R.drawable.my_documents,

    };
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        CustomList adapter = new
                CustomList(getActivity(), web, imageId);
        View v = inflater.inflate(R.layout.fragment_my_docs, container,false);
        ListView list = (ListView)v.findViewById(R.id.mydocslist);

        list.setAdapter(adapter);
        return v;

    }

   /* public void onClickViewButton(View v) {

        DetailsFragment details = (DetailsFragment)
                getFragmentManager().findFragmentById(R.id.details);
        if (details == null || details.getShownIndex() != 1) {
            // Make new fragment to show this selection.
            details = DetailsFragment.newInstance(1);

            // Execute a transaction, replacing any existing
            // fragment with this one inside the frame.
            ft
                    = getFragmentManager().beginTransaction();
            ft.add(R.id.details, details, "detail");
            ft.setTransition(
                    FragmentTransaction.TRANSIT_FRAGMENT_FADE);
            ft.commit();
        }


        /*Fragment fragment = getActivity().getFragmentManager().findFragmentById(R.id.my_docs);
        RelativeLayout container = (RelativeLayout) getActivity().findViewById(R.id.my_docs);
        FragmentManager fragmentManager = getFragmentManager();
        LayoutInflater.from(getActivity()).inflate(R.layout.fragment_my_docs_tileview, container, false);*/


        /*Fragment fragment = new myDocsTileview ();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.contentFragment, fragment); //Container -> R.id.contentFragment
        transaction.commit();*/


    }

    /*public void onClickDoc(View v) {


        int id = v.getId();
        Fragment fragment = new display();

        if (id == R.id.education | id == R.id.Educ_But)
            fragment = new education();
        else if (id == R.id.commonlaws | id == R.id.Comm_But)
            fragment = new commonlaws();
        else if (id == R.id.Govtbenefits | id == R.id.Govt_But)
            fragment = new Govtbenefits();
        else if (id == R.id.healthcare | id == R.id.Health_But)
            fragment = new healthcare();

        RelativeLayout relativeLayout = (RelativeLayout) v.findViewById(R.id.relativeLayout);

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.relativeLayout, fragment).addToBackStack(null).commit();

    }*/





