package com.simplilearn.lvcanother;

	import com.simplilearn.lvc.AccessSpecifier;

	public class AccessInAnotherPackage {

	public static void main(String[] args) {
			
			AccessSpecifier obj=new AccessSpecifier();
			obj.display();//not able to call protected method
			obj.test();//not able to call private method
			obj.hello();//able to call public method
			obj.world();//not able to call default method
		}
}
