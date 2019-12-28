package com.example.tourlagos;

import android.content.Context;

import java.util.ArrayList;

public class DataManager {
    private static DataManager myInstance=null;
    public static ArrayList<ParkInfo> parksList;
    public static ArrayList<LandmarkInfo> landmarksList;
    public static ArrayList<EventInfo> eventsList;
    public static ArrayList<RestaurantInfo> restaurantsList;
    public static Context appContext;

    private DataManager(){}
    public static DataManager getInstance(){
        if(myInstance==null){
            myInstance=new DataManager();
            myInstance.initializeRestaurants();
            myInstance.initializeEvents();
            myInstance.initializeLandMarks();
            myInstance.initializeParks();
        }
        return myInstance;
    }

    private void initializeParks() {
        parksList=new ArrayList<>();
         parksList.add(new ParkInfo(appContext.getString(R.string.park1_name),
                 appContext.getString(R.string.park1_descript),
                 appContext.getString(R.string.park1_location),appContext.getString(R.string.park_contact)));
         parksList.add(new ParkInfo(appContext.getString(R.string.park2_name),
                 appContext.getString(R.string.park2_descript),
                 appContext.getString(R.string.park2_location),
                 appContext.getString(R.string.park2_contact)));
         parksList.add(new ParkInfo(appContext.getString(R.string.park3_name),
                         appContext.getString(R.string.park3_descript),
                 appContext.getString(R.string.park3_location),
                 appContext.getString(R.string.park3_contact)));
         parksList.add(new ParkInfo(appContext.getString(R.string.park4_name),
                 appContext.getString(R.string.park4_descript),
                 appContext.getString(R.string.park4_location),
                 appContext.getString(R.string.park4_contact)));
         parksList.add(new ParkInfo(appContext.getString(R.string.park5_name),
                 appContext.getString(R.string.park5_descript),
                 appContext.getString(R.string.park5_location),
                 appContext.getString(R.string.park5_contact)));
    }

    private void initializeRestaurants() {
        restaurantsList=new ArrayList<>();
        restaurantsList.add(new RestaurantInfo(appContext.getString(R.string.restaurant1_name),
                appContext.getString(R.string.restaurant1_descript),
                appContext.getString(R.string.restaurant1_location),
                appContext.getString(R.string.restaurant1_contact)));
        restaurantsList.add(new RestaurantInfo(appContext.getString(R.string.restaurant2_name),
                appContext.getString(R.string.restaurant2_descript),
                appContext.getString(R.string.restaurant2_location),
                appContext.getString(R.string.restaurant2_contact)));
        restaurantsList.add(new RestaurantInfo(appContext.getString(R.string.restaurant3_name),
                appContext.getString(R.string.restaurant3_descript),
                appContext.getString(R.string.restaurant3_location),
                appContext.getString(R.string.restaurant3_contact)));
        restaurantsList.add(new RestaurantInfo(appContext.getString(R.string.restaurant4_name),
                appContext.getString(R.string.restaurant4_descript),
                appContext.getString(R.string.restaurant4_location),
                appContext.getString(R.string.restaurant4_contact)));
        restaurantsList.add(new RestaurantInfo(appContext.getString(R.string.restaurant5_name),
                appContext.getString(R.string.restaurant5_descript),
                appContext.getString(R.string.restaurant5_location),
                appContext.getString(R.string.restaurant5_contact)));

    }

    private void initializeLandMarks() {
        landmarksList=new ArrayList<>();
        landmarksList.add(new LandmarkInfo(appContext.getString(R.string.landmark1_name),
                appContext.getString(R.string.landmark1_descript),
                appContext.getString(R.string.landmark1_location)
                ,R.drawable.lekki_ikoyi_bridge));
        landmarksList.add(new LandmarkInfo(appContext.getString(R.string.landmark2_name),
                appContext.getString(R.string.landmark2_descript),
                appContext.getString(R.string.landmark2_location),
                R.drawable.agba_meta));
        landmarksList.add(new LandmarkInfo(appContext.getString(R.string.landmark3_name),
                appContext.getString(R.string.landmark3_descript),
                appContext.getString(R.string.landmark3_location),
                R.drawable.national_theatre));
        landmarksList.add(new LandmarkInfo(appContext.getString(R.string.landmark4_name),
                appContext.getString(R.string.landmark4_descript),
                appContext.getString(R.string.landmark4_location),
                R.drawable.new_shrine));
        landmarksList.add(new LandmarkInfo(appContext.getString(R.string.landmark5_name),
                appContext.getString(R.string.landmark5_descript),
                appContext.getString(R.string.landmark5_location),
                R.drawable.badagary_museum));
        landmarksList.add(new LandmarkInfo(appContext.getString(R.string.landmark6_name),
                appContext.getString(R.string.landmark6_descript),
                appContext.getString(R.string.landmark6_location),
                R.drawable.five_cowries));

    }

    private void initializeEvents() {
        eventsList=new ArrayList<>();
        eventsList.add(new EventInfo(appContext.getString(R.string.event1_name),
                appContext.getString(R.string.event1_descript)));
        eventsList.add(new EventInfo(appContext.getString(R.string.event2_name),
                appContext.getString(R.string.event2_descript)));
        eventsList.add(new EventInfo(appContext.getString(R.string.event3_name),
                appContext.getString(R.string.event3_descript)));
        eventsList.add(new EventInfo(appContext.getString(R.string.event4_name),
                appContext.getString(R.string.event4_descript)));
        eventsList.add(new EventInfo(appContext.getString(R.string.event5_name),
                appContext.getString(R.string.event5_descript)));

    }

}
