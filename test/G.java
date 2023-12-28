package org.test;

public class G {
	public G()
	{
		System.out.println("super class");
		
	}
	public G(int id)
	{
		System.out.println(id);
	}
	public static void main(String[] args) {
		G q=new G();
	}

}
