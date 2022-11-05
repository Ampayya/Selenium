package com.JavaBasic;

public class Multidiamension {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String star[][]=new String[2][3];
		
		star[0][0]="selenium";
		star[0][1]="java";
		star[1][0]="manual";
		star[1][1]="tsting";
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.println(star[i][j]+"");
				
			}
			System.out.println();
		}

	}

}
