/* 
 * Control: This will be the class to define a vehicle 
 * Author: Abraham Izarra
 * Date: 28/01/2021
 */

package com.lab1.test;

public class Vehicle 
{
	private String ownerName;
	private String colour;
	private String manualOrAutomatic = " auto";
	private String registrationNumber;
	private int maximumSpeed;
	private int numberOfWheels;
	
	// constructor
	public Vehicle(String ownerName, String registrationNumber)
	{
		this.ownerName = ownerName;
		this.registrationNumber = registrationNumber;
		
	}
	
	// constructor
	public Vehicle(String ownerName, String registrationNumber, String colour, String manualOrAutomatic,
				   int maximumSpeed, int numberOfWheels)
	{
		this.ownerName = ownerName;
		this.registrationNumber = registrationNumber;
		this.colour = colour;
		this.manualOrAutomatic = manualOrAutomatic;
		this.maximumSpeed = maximumSpeed;
		this.numberOfWheels = numberOfWheels;
		
	}
	
	// method
	public String toString()
	{
		String output;
		
		return output = "Vehicle " + "Owner " + this.ownerName + " Registration number " +
						this.registrationNumber + " Colour " + this.colour + " Manual or Automatic " + 
						this.manualOrAutomatic + " Max speed " + this.maximumSpeed + " Number of Wheels " + 
						this.numberOfWheels;
		
	}
	
	public boolean recentCar()
	{
		String chars = this.registrationNumber.substring(0,2);
		int year = Integer.parseInt(chars);
		
		if (year > 02)
		{
			return true;
			
		}
		else
		{
			return false;
			
		}
		
	}
}
