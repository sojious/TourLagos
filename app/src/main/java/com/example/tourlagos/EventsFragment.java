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
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentsListResource=inflater.inflate(R.layout.attractions_category_res,container,false);
        AttractionsListAdapter mAttrationListAdapter=new AttractionsListAdapter(getContext(),0,DataManager.eventsList,this);
        ListView eventsListView=fragmentsListResource.findViewById(R.id.category_list);
        eventsListView.setAdapter(mAttrationListAdapter);
        return fragmentsListResource;
    }

}
