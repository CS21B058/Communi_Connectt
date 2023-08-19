package com.example.communiconnect;
import java.io.Serializable;

class LocationInfo implements Serializable {
    private static final long serialVersionUID = 1L; // Adding a serial version UID

    private double latitude;
    private double longitude;
    private String title;
    private String description;

    public LocationInfo(double latitude, double longitude, String title, String description) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.description = description;
    }

    // Getters and setters for the fields
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Location: " + title + "\n"
                + "Latitude: " + latitude + "\n"
                + "Longitude: " + longitude + "\n"
                + "Description: " + description;
    }
}
