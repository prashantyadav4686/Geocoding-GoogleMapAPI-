/*package com.qait.GoogleMaps;


import java.util.Map;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
 
public class GetCoordinates {

    static String address = "The White House, Washington DC";

    public static void main(String[] args) {
    	BasicConfigurator.configure();

        Map<String, Double> coords;
        coords = OpenStreetMapUtils.getInstance().getCoordinates(address);
        System.out.println("latitude :" + coords.get("lat"));
        System.out.println("longitude:" + coords.get("lon"));
    }
}
*/