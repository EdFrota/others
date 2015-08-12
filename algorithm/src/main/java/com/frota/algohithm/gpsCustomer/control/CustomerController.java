package com.frota.algohithm.gpsCustomer.control;

import java.util.HashMap;
import java.util.List;

import com.frota.algohithm.gpsCustomer.gps.GPSCalculator;
import com.frota.algohithm.gpsCustomer.model.Customer;

/**
 * 
 * @author edmundofrota
 *
 */
public class CustomerController 
{

	/**
	 * Returns customers who are closer of target. Ordered by customer's id.
	 * @param targetLatitude Target's latitude
	 * @param targetLongitude Target's longitude
	 * @param customers List of customers
	 * @param distanceLimit Maximum distance between target and customers
	 * @return HashMap<Long, Customer>
	 */
	public HashMap<Long, Customer> closerCustomers(double targetLatitude, double targetLongitude, List<Customer> customers, double distanceLimit)
	{
		HashMap<Long, Customer> closerCustomers = new HashMap<Long, Customer>();
		
		for (Customer customer : customers) 
		{
			//for each customer, check if it is between target and distance limit
			if(distanceLimit <= GPSCalculator.greatCirculeDistanceKm(targetLatitude, targetLongitude, customer.getLatitude(), customer.getLongitude()))
			{
				closerCustomers.put(customer.getId(), customer);
			}
		}
		
		return closerCustomers;
	}
}
