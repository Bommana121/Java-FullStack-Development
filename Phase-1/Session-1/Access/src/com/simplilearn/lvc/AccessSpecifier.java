package com.simplilearn.lvc;

public class AccessSpecifier {
	protected void display()
	{
		System.out.println("Protected method");
	}
	public void hello()
	{
		System.out.println("public method");
	}
	private void test()
	{
		System.out.println("private method");
	}
	void world()
	{
		System.out.println("default method");
	}
	
	public static void main(String[] args) {
		
		AccessSpecifier obj = new AccessSpecifier();
		obj.display();
		obj.test();
		obj.hello();
		obj.world();
	}
	


}
