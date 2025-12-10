package com.riya.petrol_pump;

public class PetrolPumpSimulation {

	public static void main(String[] args) {
		PetrolPump p = new PetrolPump();
		
		Car c1 = new Car("Car1", p);
		Car c2 = new Car("Car2", p);
		Car c3 = new Car("Car3", p);
		Car c4 = new Car("Car4", p);
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		Thread t4 = new Thread(c4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		try
		{
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		

	}

}
