package com.jhuoose.foodaholic.models;

import java.util.ArrayList;

public class Event {
    private String eventName;
    private String startTime;
    private String endTime;
    private ArrayList<Activity> activityList = new ArrayList<>();

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ArrayList<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(ArrayList<Activity> activityList) {
        this.activityList = activityList;
    }
}