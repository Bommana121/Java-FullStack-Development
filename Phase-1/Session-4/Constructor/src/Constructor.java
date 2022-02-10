package constructor;

public class Constructor {

	int id;
	String name;
	
	public Constructor()
	{
		id=23;
		name="Charan";
	}
	public Constructor(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		Constructor obj=new Constructor();
		System.out.println("User 1");
		System.out.println("Id: "+obj.id);
		System.out.println("Name: "+obj.name);
		
		Constructor obj2= new Constructor(45,"Rohit");
		System.out.println("User 2");
		System.out.println("Id: "+obj2.id);
		System.out.println("Name: "+obj2.name);
		
		
		
	}
}
