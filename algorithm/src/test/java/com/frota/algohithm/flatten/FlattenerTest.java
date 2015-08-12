package com.frota.algohithm.flatten;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author edmundofrota
 *
 */
public class FlattenerTest 
{

	@Test
	public void testFlatten() 
	{
		Integer[] integerArray = null;
		Object[] objectArray = null;
		
		//not null
		assertNotNull(Flattener.flatten(null));
		
		//empty array
		integerArray = new Integer[]{};
		objectArray = new Object[] {};
		assertArrayEquals(integerArray, Flattener.flatten(objectArray).toArray());
		
		//unnested array
		integerArray = new Integer[]{1, 2, 3, 4};
		objectArray = new Object[] {1, 2, 3, 4};
		assertArrayEquals(integerArray, Flattener.flatten(objectArray).toArray());
		
		//nested array
		integerArray = new Integer[]{1, 2, 3, 4, 5};
		objectArray = new Object[] {1, new Object[] {2, 3, new Object[] {4}}, 5};
		assertArrayEquals(integerArray, Flattener.flatten(objectArray).toArray());
		
	}

}
