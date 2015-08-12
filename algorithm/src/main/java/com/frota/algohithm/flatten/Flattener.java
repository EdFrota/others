package com.frota.algohithm.flatten;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author edmundofrota
 *
 */
public class Flattener 
{

	/**
	 * Flatten an array of nested arrays into a flat array.
	 * @param nestedArray Array of Object
	 * @return List<Integer>
	 */
	public static List<Integer> flatten(Object[] nestedArray)
	{
		List<Integer> flattened = new ArrayList<Integer>();
		
		//verify NullPointerException
		if(nestedArray == null)
		{
			return flattened;
		}
		
		for (int i = 0; i < nestedArray.length; i++) 
		{
			//if content is an Integer
			if(nestedArray[i] instanceof Integer)
			{
				flattened.add((Integer) nestedArray[i]);
			}
			else
			{
				//if not, execute method through recursion
				flattened.addAll(flatten((Object[]) nestedArray[i]));
			}
		}
		
		return flattened;
	}
	
}
