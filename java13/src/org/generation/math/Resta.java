package org.generation.math;

public class Resta {
	public int restaEnteros(int a, int b) {
		if(a<0) a=0;
		if(b<0) b=0;
		return (a)-(b);
	}
	//aplicamos una sobrecarga de metodos
	public float restaEnteros(float a,float b) {
		if(a<0) a=0;
		if(b<0) b=0;
		return (a)-(b);
	}
}
