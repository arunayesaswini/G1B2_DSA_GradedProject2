package com.greatlearning.main;

import java.util.Scanner;


import com.greatlearning.services.AssembleFloors;


public class MainBuildingDriver {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	
		AssembleFloors assemble=new AssembleFloors();
	
		
		
		System.out.println("Enter total number of floors in the building");
		int building_size=sc.nextInt();
		
		for(int i=1;i<=building_size;i++)
		{
			System.out.println("Enter floor size of day"+i+":");
			int floor=sc.nextInt();
			assemble.insert(floor);
			
		}  
		assemble.assembleFloors();  
		
		
		sc.close();
	}

}
