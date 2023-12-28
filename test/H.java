package org.test;

public class H extends I
{
private H(){
	super(12);
	System.out.println("constructor");
	}
public static void main(String[] args) {
	H h=new H();
}
}