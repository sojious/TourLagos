package com.example.tourlagos;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AttractionsListAdapter extends ArrayAdapter {

    private final String fragmentName;
    private TextView itemTitle;
    private ImageView itemImage;
    private TextView itemDescription;
    private TextView itemLocation;
    private TextView itemOtherInfo;
    private final List mlist;
    private final Context mContext;

    public AttractionsListAdapter(Context context, int resource, List objects, Fragment callerFragment) {
        super(context, resource, objects);
        mContext = context;
        mlist = objects;
        fragmentName = callerFragment.getClass().getSimpleName();
    }

    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.attractions_list_items_res,parent,false);

            }
        itemTitle = convertView.findViewById(R.id.title_list_item);
        itemImage = convertView.findViewById(R.id.image_list_item);
        itemDescription = convertView.findViewById(R.id.descript_lis_item);
        itemLocation = convertView.findViewById(R.id.location_list_item);
        itemOtherInfo = convertView.findViewById(R.id.contact_open_hrs_list_item);
        RearrangeViewsForEmptyFields(position);
            return convertView;
    }



    private void RearrangeViewsForEmptyFields(int currentItemPos) {
        if(fragmentName.equals(mContext.getString(R.string.landmarkfragment_class_name))){
            itemOtherInfo.setVisibility(View.GONE);
            LandmarkInfo currentLandmark = (LandmarkInfo) mlist.get(currentItemPos);
            itemTitle.setText(currentLandmark.getItemName());
            itemImage.setImageDrawable(mContext.getDrawable(currentLandmark.getItemImageId()));
            itemDescription.setText(currentLandmark.getItemDescription());
            itemLocation.setText( mContext.getString(R.string.location_text)+currentLandmark.getItemLocation());
        }
        if(fragmentName.equals(mContext.getString(R.string.parkfragment_class_name))){
            itemImage.setVisibility(View.GONE);
            ParkInfo currentPark = (ParkInfo) mlist.get(currentItemPos);
            itemTitle.setText(currentPark.getItemName());
            itemDescription.setText(currentPark.getItemDescription());
            itemLocation.setText(mContext.getString(R.string.location_text)+currentPark.getItemLocation());
            itemOtherInfo.setText(mContext.getString(R.string.contact_text) +currentPark.getItemContact());
        }
        if(fragmentName.equals(mContext.getString(R.string.restaurantfragment_class_name))){
            itemImage.setVisibility(View.GONE);
            RestaurantInfo currentRestaurant = (RestaurantInfo) mlist.get(currentItemPos);
            itemTitle.setText(currentRestaurant.getItemName());
            itemDescription.setText(currentRestaurant.getItemDescription());
            itemLocation.setText(mContext.getString(R.string.location_text)+currentRestaurant.getItemLocation());
            itemOtherInfo.setText(mContext.getString(R.string.location_text)+currentRestaurant.getItemContact());
        }
        if(fragmentName.equals(mContext.getString(R.string.eventfragment_class_name))){
            itemImage.setVisibility(View.GONE);
            itemLocation.setVisibility(View.GONE);
            itemOtherInfo.setVisibility(View.GONE);
            EventInfo currentEvent= (EventInfo) mlist.get(currentItemPos);
            itemTitle.setText(currentEvent.getItemName());
            itemDescription.setText(currentEvent.getItemDescription());

        }
    }

    @Override
    public int getCount() {
        return mlist.size();
    }
}
