package onroute.com.onroute;

import com.google.gson.annotations.Expose;

import lombok.Getter;
import lombok.Setter;


public class Location {
    @Expose @Getter @Setter public double latitude;
    @Expose @Getter @Setter public double longitude;


    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
