package com.riya.itc;

public class Restaurant {
	private String name;
	private String order;
	private boolean isOrderReady = false;
	
	public Restaurant(String name)
	{
		this.name = name;
	}
	public synchronized void placeOrder(String order )
	{
		this.order = order;
		System.out.println("Waiter placed order for "+order);
		try
		{
		
		while(!isOrderReady)
		{
			wait();
		}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
			System.out.println("Waiter : Serving the " + order);
		}
		
	
	
	public synchronized void prepareOrder()
	{
		
		System.out.println("chef : Preparing " + order);

		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		isOrderReady=true;
		System.out.println("Chef: "+order+ "is ready!");
		notifyAll();
		

	}
		
	public String getRestaurantName()
	{
		return name;
	}

}
