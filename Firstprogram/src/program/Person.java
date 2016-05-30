/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Prazol
 */

public class Person
{
private String name;
private String surname;
private String gender;
private int age;
private String address;
private String account;

public Person(String nm, String surnm, String gndr, int ag, String ads, String acc)
{
name= nm;
surname= surnm;
gender= gndr;
age= ag;
address=ads;
account=acc;
}
public void setName(String naMe)
{
name= naMe;
}
public String getName()
{
return name;
}
public void setSurname(String surN)
{
surname= surN;
}
public String getSurename()
{
return surname;
}
public void setGender(String gndr)
{
gender= gndr;
}
public String getGender()
{
return gender;
}
public void setAge(int agg)
{
age= agg;
}
public int getAge()
{
return age;
}
public void setAddress(String adres)
{
address= adres;
}
public String getAddress()
{
return address;
}
public void setAccount(String accnt)
{
account= accnt;
}
public String getAccount()
{
return account;
}
public void displayMessage()
{
System.out.println("The name of account holder is " + name + " and surname is " + surname + " gender is " + gender + " The address of account holder is " + address + " account is " + account);
}
}
