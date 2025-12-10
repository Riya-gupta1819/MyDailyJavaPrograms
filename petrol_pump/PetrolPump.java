package com.riya.petrol_pump;

public class PetrolPump {
	
	public synchronized  void refillCar(String carName)
	{
				
		
		try 
		{
			System.out.println(carName+" start filling ");

			Thread.sleep(3000);
			System.out.println(carName+" complete refiling");
			
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
	}
	

}
