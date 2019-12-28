package com.example.tourlagos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentsListResource=inflater.inflate(R.layout.attractions_category_res,container,false);
        AttractionsListAdapter mAttrationListAdapter=new AttractionsListAdapter(getContext(),0,DataManager.parksList,this);
        ListView parksListView=fragmentsListResource.findViewById(R.id.category_list);
        parksListView.setAdapter(mAttrationListAdapter);
        return fragmentsListResource;
    }

}
