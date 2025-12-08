package com.riya.odd_even;

public class OddEven extends Thread
{

	public static void main(String[] args) {
		
		Odd odd = new Odd();
		Even even = new Even();
		
		
		odd.start();
		
		try
		{
			odd.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	
		
		even.start();
		
	}

}
