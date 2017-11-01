package beans;

import java.util.*;


public class Test
{
    private List fruits;
	private Set cricketers;
	private Map cc;
	
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public void setCc(Map cc) {
		this.cc = cc;
	}
	
	public void printData()
	{
		System.out.println("..........Fruits..........");
		for(Object fruit:fruits)
		{
			System.out.println(fruit);
		}
		System.out.println("..........Cricketers..........");
		for(Object cricketer:cricketers)
		{
			System.out.println(cricketer);
		}
		System.out.println("..........Countries and Capitals..........");
		Set keys=cc.keySet();
		for(Object key:keys)
		{
			System.out.println(key+":"+cc.get(key));
		}
	}
}
