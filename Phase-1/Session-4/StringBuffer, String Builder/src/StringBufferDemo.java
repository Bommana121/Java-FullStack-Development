package string;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer str =new  StringBuffer();
		System.out.println(str.charAt(4));
		System.out.println(str.length());
		System.out.println(str.replace(0, 5,"Welcome"));
		System.out.println(str.reverse());
	}

}
