package org.generation;

public class ejercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		for(a=0, b=0; b>a; a++,b++) {
			System.out.println(a+"+b");
		}
		System.out.println(a+""+b);
		
		a=1;
		b=10;
		
		do {
			if(a++ >--b) continue;
		} while (a<5);
		System.out.println(a+""+b);
		
		int x=12;
		while(x<10) {
			x--;
		}
		System.out.println(x);
	
		Integer y= new Integer(1)+new Integer(2);
		switch(y) {
		case 3: System.out.println("three"); break;
		default: System.out.println("other"); break;
		}
		byte z=10;
		
		do {
			z--;
			System.out.println(z);
		} while (z<10);
		
		x=0;
		
		
		
		
		int timezone=2;
		String s= "-";
		switch(timezone){
		case 1 : s +="e";
		case 2 : s+="c";
		}
		System.out.println(s);
	}
	
	
	

}
