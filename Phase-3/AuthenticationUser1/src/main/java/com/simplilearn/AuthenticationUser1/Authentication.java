package com.simplilearn.AuthenticationUser1;

public class Authentication {

	public boolean validate(String uname, String pwd)
	{
		if(uname.equals("charan") && pwd.equals("charan"))
		return true;
		else
			return false;
	}
}
