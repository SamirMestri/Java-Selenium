package singleLevelInheritance;

public class Son extends Father {
	
	public void job()
	{
		System.out.println("Son has his own job");
	}
	
	public void bike()
	{
		System.out.println("Son has his own bike");
	}
	
	
	public static void main(String[] args) {
		
		Son w = new Son();
		w.bike();
		w.job();
		w.farm();
		w.house();
		
	}

}
