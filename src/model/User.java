package Model;


//import java.util.Vector;
import Controller.Message;

import java.util.*;
import java.util.Scanner;

import Controller.Group;
public class User {

  public String UserName;
  private String Password;
  protected String Phone;
  protected String Address;
  public String Email;
  public String Gender;
  public String Interests;
  public ArrayList <User>Friends= new ArrayList();
  public ArrayList <User>FriendRequests= new ArrayList();
  Message [] messages;
  Group [] groups;
  //UserManagment ug;

public User() {}
public User(String uN)
{
	this.UserName=uN;
}

public void SetUser(User u)
{
    this.UserName=u.GetUserName();
    this.Password=u.GetPassord();
    this.Phone=u.GetPhone();
    this.Address=u.GetAddres();
}

public boolean Login(UserManagment ug) {
    User j=ug.isExist(this);
    if(j!=null)return true;
    else return false;
}


public boolean SignUp(UserManagment ug) {
    boolean j=ug.isValidUser(this);
    System.out.print(this.UserName + " "+ this.Password +" "+j);
    
    if(j)return true;
    else return false;
}

public void acceptAddRequest(User u)
{
	System.out.println("User whose name is" + u.GetUserName() + " wants to be your friend,");
	System.out.println("Press 1 to accept him");
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	
}
public void SetPhone(String ph) {
    Phone=ph;
}

public String GetPhone() {
    return Phone;
}

public void SetPassword(String pas) {
    Password=pas;
}

public String GetPassord() {
    return Password;
}

public void SetAddress(String Add) {
    Address=Add;
}

public String GetAddres() {
    return Address;
}

public void SetUserName(String Un) {
    UserName=Un;
}

public String GetUserName() {
    return UserName;
}


  public void like() {
  }

  public void share() {
  }

  public void comment() {
  }

  public void post() {
  }

  public void follow() {
  }

  public void sendMessage() {
  }

  public void recieveMessage() {
  }

  public void createMessage() {
  }


}
