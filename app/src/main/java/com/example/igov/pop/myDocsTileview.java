package com.example.igov.pop;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;



public class myDocsTileview extends Fragment {
    public FragmentTransaction ft;
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_my_docs_tileview, null);

        /*Button tilebutton = (Button)v.findViewById(R.id.tilebutton);
        tilebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                DetailsFragment details = (DetailsFragment)
                        getFragmentManager().findFragmentById(R.id.details);
                if (details == null || details.getShownIndex() != 1) {
                    // Make new fragment to show this selection.
                    details = DetailsFragment.newInstance(1);

                    // Execute a transaction, replacing any existing
                    // fragment with this one inside the frame.
                    ft
                            = getFragmentManager().beginTransaction();
                    ft.add(R.id.my_docs_tileview ,myDocsTileview, "detail");
                    ft.setTransition(
                            FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                    ft.commit();
                }
            }

        });*/
        return v;

    }
}