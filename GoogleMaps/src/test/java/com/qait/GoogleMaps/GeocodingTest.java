package com.qait.GoogleMaps;


import org.testng.annotations.Test;

import java.io.IOException;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * Unit test for simple App.
 */
public class GeocodingTest {
	MapAPI ma = new MapAPI();
	@Test()
	public void Test01_Map() throws IOException, ParseException {
     String json = ma.getJSONByGoogle("1600 Amphitheatre Parkway,Mountain View,CA,94043");
     System.out.println("JSON Object String : "+json);
     Object obj = new JSONParser().parse(json);
     JSONObject obj_json =(JSONObject) obj;
     String str = (String) obj_json.get("status");
     System.out.println("Status : "+str);
     JSONArray obj_array = (JSONArray) obj_json.get("results");
     System.out.println("results : "+obj_array);
     JSONObject obj_json3 =  (JSONObject) obj_array.get(0);
     System.out.println("Object Insdide Array : "+obj_json3);
     JSONObject obj_json4 =  (JSONObject) obj_json3.get("geometry");
     System.out.println("Geometry : "+obj_json4);
     JSONObject obj_json5 =  (JSONObject) obj_json4.get("location");
     System.out.println("Location : "+obj_json5);
     System.out.println("latitude is "+  obj_json5.get("lat"));
     System.out.println("longitude is "+  obj_json5.get("lng"));
  
        }
    
	}
