package com.simplilearn.lvcanother;

	import com.simplilearn.lvc.AccessSpecifier;

	
	public class AccessOfProtected extends AccessSpecifier{

	public static void main(String[] args) {
			
			AccessOfProtected obj=new AccessOfProtected();
			obj.display();// able to call protected method
			obj.test();//not able to call private method
			obj.hello();//able to call public method
			obj.world();//not able to call default method
		}

}
