package innerclass;

public class LocalInnerClass {
	
	void validate(int age)
	{
		if(age>=18)
		{
			class Inner{
				void test()
				{
					System.out.println("Now Authenticate User using Aadhar");
		
				}
			}
		}
		else
		{
			System.out.println("No need to Authenticate");
		}
		Inner inner =new Inner();
		inner.test();
		
	}
	public static void main(String[] args) {
		LocalInnerClass local = new LocalInnerClass();
		local.validate(45);
	}

}
