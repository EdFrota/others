package com.frota.algohithm.gpsCustomer;

import static org.junit.Assert.*;
import org.junit.Test;

import com.frota.algohithm.gpsCustomer.gps.GPSCalculator;

/**
 * 
 * @author edmundofrota
 *
 */
public class GPSCalculatorTest 
{

	@Test
	public void testGreatCirculeDistanceMile()
	{
		double x1 = 53.4692815;
		double y1 = -9.436036;
		
		double x2 = 53.2451022;
		double y2 = -6.238335;
		
		double distance = 132.79;
		
		//right distance
		assertEquals(distance, GPSCalculator.greatCirculeDistanceMile(x1, y1, x2, y2), 0.5);
	}
	
	@Test
	public void testGreatCirculeDistanceKm()
	{
		double x1 = 53.4692815;
		double y1 = -9.436036;
		
		double x2 = 53.2451022;
		double y2 = -6.238335;
		
		double distance = 132.79 * 1.6;
		
		//right distance
		assertEquals(distance, GPSCalculator.greatCirculeDistanceKm(x1, y1, x2, y2), 0.5);
	}
}
