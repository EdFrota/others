package com.frota.algohithm.gpsCustomer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.frota.algohithm.gpsCustomer.utils.ReadFileCustomer;

/**
 * 
 * @author edmundofrota
 *
 */
public class ReadFileTest 
{

	@Test
	public void testReadFile()
	{
		ReadFileCustomer readFileCustomer = new ReadFileCustomer();
		Exception noneException = new Exception("File couldn't be found!");
		Exception brokenException = new Exception("Parse JSON file error!");
		String rightJsonFileName = "customers";
		String noneJsonFileName = "none";
		String brokenJsonFileName = "brokenFile";
		
		//null
		try 
		{
			assertNull(readFileCustomer.readFile(null));
		} 
		catch (Exception e) 
		{
			System.out.println("null " + e.getMessage());
		} 
		
		//rigth file
		try 
		{
			assertNotNull(readFileCustomer.readFile(rightJsonFileName));
		} 
		catch (Exception e) 
		{
			System.out.println("rigth file " + e.getMessage());
		}
		
		//none file name
		try 
		{
			assertEquals(noneException, readFileCustomer.readFile(noneJsonFileName));
		} 
		catch (Exception e) 
		{
			System.out.println("none file name " + e.getMessage());
		}
		
		//broken JSON file pattern
		try 
		{
			assertEquals(brokenException, readFileCustomer.readFile(brokenJsonFileName));
		} 
		catch (Exception e) 
		{
			System.out.println("broken file name " + e.getMessage());
		}
	}
}
