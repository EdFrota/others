package com.frota.algohithm.gpsCustomer;

import static org.junit.Assert.*;
import org.junit.Test;

import com.frota.algohithm.gpsCustomer.model.Customer;

/**
 * 
 * @author edmundofrota
 *
 */
public class CustomerTest 
{

	@Test
	public void testCustomer()
	{
		Customer c1 = new Customer();
		
		c1.setId(0);
		c1.setName(null);
		c1.setLatitude(0);
		c1.setLongitude(0);
		
		Customer c2 = new Customer(0, null, 0, 0);
		
		//not null
		assertNotNull(new Customer(0, null, 0, 0));
		
		//constructor
		assertEquals(c1.getId(), c2.getId());
		assertEquals(c1.getName(), c2.getName());
		assertEquals(c1.getLatitude(), c2.getLatitude(), 0);
		assertEquals(c1.getLongitude(), c2.getLongitude(), 0);
	}
}
