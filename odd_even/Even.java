package com.riya.odd_even;

public class Even extends Thread
{
	
	@Override
	public void run()
	{
		for(int i = 1; i<=10; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+ " by main");
				
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
