package com.simplilearn.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.simplilearn.AuthenticationUser1.Authentication;
@DisplayName("Authentication user")
@RunWith(JUnitPlatform.class)
public class AuthenticateUserTest {

	Authentication auth=new Authentication();
	
	@Test
	public void test() {
		
		assertTrue(auth.validate("charan", "charan"));
		System.out.println("Correct Details");
	}

	
	
	@Test
	public void test1() {
		assertFalse(auth.validate("tarun", "charan") );
		System.out.println("\nIncorrect Details");
	}
	
	
	
}
