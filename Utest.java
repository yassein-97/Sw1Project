package Test;

import static org.junit.Assert.*;

import org.junit.Test;
import Model.*;
import Controller.controller;
public class Utest {

	@Test
	public void signUp() {
		User u=new User();
	 UserManagment um=new UserManagment();
		u.SetUserName("esr");
		u.SetPassword("123456");
		u.SetPhone("01150447106");
		u.SetAddress("asd123");
		um.SetUser(u);
		boolean x= u.SignUp(um);
		System.out.println(x);
		assertTrue(x);
	}
	@Test
	public void signUpFail() {
		User u=new User();
	 UserManagment um=new UserManagment();
		u.SetUserName("ahmed");
		u.SetPassword("wrongpass");
		u.SetPhone("01150447106");
		u.SetAddress("asd123");
		um.SetUser(u);
		boolean x= u.SignUp(um);
		assertFalse(x);
	}
	
	@Test
	public void addFriend() {
		User u1=new User();
		UserManagment um=new UserManagment();
		controller c=new controller();
		u1.SetUserName("friend1");
		u1.SetPassword("pass");
		u1.SetPhone("01150447106");
		u1.SetAddress("asd123");
		um.SetUser(u1);
		User u2=new User();
		u2.SetUser(u1);
		u2.SetUserName("friend2");
		u1.SignUp(um);
		u2.SignUp(um);
		
		String message=c.addFriend(u1,u2);
		boolean x=true;
		if(message!="you added him !")
			x=false;
		assertTrue(x);
	
	}

	@Test
	public void addFriendFail() {
		User u1=new User();
		UserManagment um=new UserManagment();
		controller c=new controller();
		u1.SetUserName("friend1");
		u1.SetPassword("pass");
		u1.SetPhone("01150447106");
		u1.SetAddress("asd123");
		um.SetUser(u1);
		User u2=new User();
		u2.SetUser(u1);
		u2.SetUserName("friend2");
		String message=c.addFriend(u1,u2);
		boolean x=true;
		if(message!="you added him !")
			x=false;
		assertFalse(x);
	
	}
	@Test
	public void acceptRequestFail()
	{
		User u1=new User();
		UserManagment um=new UserManagment();
		controller c=new controller();
		u1.SetUserName("friend1");
		u1.SetPassword("pass");
		u1.SetPhone("01150447106");
		u1.SetAddress("asd123");
		um.SetUser(u1);
		User u2=new User();
		u2.SetUser(u1);
		u2.SetUserName("friend2");
		String message=c.acceptAddrequest(u1, u2);
		boolean x=(message=="Done!!!");
		assertFalse(x);
	}
	@Test
	public void acceptRequest()
	{
		User u1=new User();
		UserManagment um=new UserManagment();
		controller c=new controller();
		u1.SetUserName("fr1");
		u1.SetPassword("pass");
		u1.SetPhone("01150447106");
		u1.SetAddress("asd123");
		um.SetUser(u1);
		User u2=new User();
		u2.SetUser(u1);
		u2.SetUserName("fr2");
		c.addFriend(u1,u2);
		String message=c.acceptAddrequest(u1, u2);
		boolean x=(message=="Done!!!");
		assertFalse(x);
	}
	
	

}