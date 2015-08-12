package com.frota.algohithm;

import java.util.List;

import com.frota.algohithm.flatten.Flattener;

/**
 * 
 * @author edmundofrota
 *
 */
public class AppFlattener 
{

	public static void main(String[] args)
	{
		Object[] nestedArray = new Object[]{new Object[]{1, 2, new Object[]{3}}, 4};
		
		//flattens the array
		List<Integer> flattenedIntegerList = Flattener.flatten(nestedArray);
		
		//print flattened array
		for (Integer integer : flattenedIntegerList) 
		{
			System.out.println(integer);
		}
	}
}
