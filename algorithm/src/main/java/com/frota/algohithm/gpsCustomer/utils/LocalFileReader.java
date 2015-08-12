package com.frota.algohithm.gpsCustomer.utils;

import java.io.Serializable;
import java.util.List;

import com.frota.algohithm.gpsCustomer.model.Customer;

public interface LocalFileReader<T extends Serializable>
{
	
	/**
	 * Read local file.
	 * @param <T> the type of the elements of list return
	 * @param jsonFileName JSON file name
	 * @return List of objects
	 * @throws Exception
	 */
	List<Customer> readFile(String jsonFileName) throws Exception;
}
