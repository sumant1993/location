package com.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue
    public int id;
    public String userId;
    public String latititude;
    public String longitude;

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", userId='" + userId + '\'' +
                ", latititude='" + latititude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLatititude() {
        return latititude;
    }

    public void setLatititude(String latititude) {
        this.latititude = latititude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Location() {
    }

    public Location(int id, String userId, String latititude, String longitude) {
        this.id = id;
        this.userId = userId;
        this.latititude = latititude;
        this.longitude = longitude;
    }
}