/* 
 * Control: This will be the main class which prints hello world
 * Author: Abraham Izarra
 * Date: 28/01/2021
 */

package com.lab1.test;


public class Control 
{
	public static void main(String[] args)
	{
		System.out.println("Hello World \n");
		
		Vehicle v1 = new Vehicle("Abraham", "171CN5678");
		Vehicle v2 = new Vehicle("David", "01MH4567", "Gray", "Manual", 200, 4);
		
		boolean recent = v1.recentCar();
		System.out.println(v1 + "\n" + recent + "\n");
	
		
		recent = v2.recentCar();
		System.out.println(v2.toString() + "\n" + recent);
		
		
	}
	
}
