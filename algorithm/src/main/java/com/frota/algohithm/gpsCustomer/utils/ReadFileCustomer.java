package com.frota.algohithm.gpsCustomer.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.frota.algohithm.gpsCustomer.model.Customer;

public class ReadFileCustomer implements LocalFileReader<Customer>
{
	
	public List<Customer> readFile(String jsonFileName) throws Exception
	{
		List<Customer> objects = new ArrayList<Customer>();
		
		long user_id = 0;
        String name = null;
        double latitude = 0d;
        double longitude = 0d;
		JSONObject jsonObject = null;
        
		
		//read a JSON file what returns a list of JSONObjects
    	JSONArray jsonObjects;
		try 
		{
			jsonObjects = (JSONArray) new JSONParser().parse(new FileReader(jsonFileName + ".json"));
			
			for (int i = 0; i < jsonObjects.size(); i++) 
	        {
	        	jsonObject = (JSONObject) jsonObjects.get(i);
	        	
	        	user_id = (Long) jsonObject.get("user_id");
	            name = (String) jsonObject.get("name");
	            latitude = Double.parseDouble((String) jsonObject.get("latitude"));
	            longitude = Double.parseDouble((String) jsonObject.get("longitude"));
	            
	            //get attributes from JSONObjcet and set in Customer
				objects.add(new Customer(user_id, name, latitude, longitude));
			}
		} 
		catch (FileNotFoundException e) 
		{
			throw new Exception("File couldn't be found!");
		} 
		catch (IOException e) 
		{
			throw new Exception("Error IOException!");
		} 
		catch (ParseException e) 
		{
			throw new Exception("Parse JSON file error!");
		}
 
        return objects;
	}
	
}
