package com.frota.algohithm.gpsCustomer.gps;

/**
 * 
 * @author edmundofrota
 *
 */
public class GPSCalculator 
{

	/**
	 * Calculate the Great Circle distance. Return distance in miles.
	 * @param x1 Latitude Point 1
	 * @param y1 Longitude Point 1
	 * @param x2 Latitude Point 2
	 * @param y2 Longitude Point 2
	 * @return double
	 */
	public static double greatCirculeDistanceMile(double x1, double y1, double x2, double y2)
	{
		//convert degrees to radians
		x1 = Math.toRadians(x1);
		x2 = Math.toRadians(x2);
		y1 = Math.toRadians(y1);
		y2 = Math.toRadians(y2);
		
		//Haversine formula
		double distance = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin((x2-x1)/2), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2-y1)/2), 2)));
		
		//convert back to degrees
		//each degree is 69.1105 miles
		//distance is angle multiplied by 69.1105
		return Math.toDegrees(distance) * 69.1105;
	}
	
	/**
	 * Calculate the Great Circle distance. Return distance in kilometers.
	 * @param x1 Latitude Point 1
	 * @param y1 Longitude Point 1
	 * @param x2 Latitude Point 2
	 * @param y2 Longitude Point 2
	 * @return double
	 */
	public static double greatCirculeDistanceKm(double x1, double y1, double x2, double y2)
	{
		//Km = mile * 1.6
		return greatCirculeDistanceMile(x1, y1, x2, y2) * 1.6;
	}
	
}
