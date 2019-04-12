package com.qait.GoogleMaps;


import java.io.*;  
import java.net.*;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class MapAPI {
	private static final String URL = "https://maps.googleapis.com/maps/api/geocode/json";
	private static final String API_key = "AIzaSyAHMGDrTEvBgSceeYitpYxdlISGK-QSJtw"; 
	public String getJSONByGoogle(String fullAddress) throws IOException {
		URL url = new URL(URL + "?address=" + URLEncoder.encode(fullAddress, "UTF-8")
		+"&key="+API_key+ "&sensor=false");
		 final HttpURLConnection con = (HttpURLConnection) url.openConnection();
		 con.setRequestMethod("GET");
		 if (con.getResponseCode() != 200) {
	            return null;
	        }
		 BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	        String inputLine;
	        StringBuffer response = new StringBuffer();

	        while ((inputLine = in.readLine()) != null) {
	        	//System.out.println(inputLine);
	            response.append(inputLine);
	        }
	        in.close();
		return response.toString();
	}
}
/*class Example{
	public static void main(String []args) throws IOException {
	MapAPI map = new MapAPI();
	 String json = map.getJSONByGoogle("1600 Amphitheatre Parkway,Mountain View,CA,94043");
	   // System.out.println(json);
	
  }
}
*/
