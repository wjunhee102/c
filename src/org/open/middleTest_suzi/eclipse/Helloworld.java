package org.open.middleTest_suzi.eclipse;

public class Helloworld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		a = 80;
		b = 100;
		c = 100;
		d = 90;
		
		int sum = a + b + c + d;
		
		int avg = sum/4;
		
		String rank;
		
		if(avg >= 90) {
			rank = "A" ;
		} else if (avg >= 80) {
			rank = "B";
		} else if (avg >= 70) {
			rank = "C";
		} else {
			rank = "D";		
		}
		
		System.out.println("suzi test result " + rank);
	}

}
