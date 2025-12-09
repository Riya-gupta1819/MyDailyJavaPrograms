package com.riya.odd_even_thread;

public class OddThread extends Thread
{
	@Override
	public void run()
	{
	for(int i = 1; i<=10; i++)
	{
		if(i%2!=0)
		{
			System.out.println(i+" by " +Thread.currentThread().getName());
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	}

}
