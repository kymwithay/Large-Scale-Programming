package test;

import java.io.IOException;
import main.java.*;

public class main 
{

	public static void main(String[] args) 
	{
		PhoneDirectory KymsContacts = new PhoneDirectory();
		String name_to_find = "Kayla Hawkins";
		String name_to_add = "Jaleel Brown";
		String num_to_add = "6655443";
		String name_to_delete = "Anika Hamilton";
		String name_to_change = "Lakeia Sales";
		String num_to_change = "3012014";
		
		KymsContacts.addEntry(name_to_add, num_to_add);
		KymsContacts.changeEntry(name_to_change, num_to_change);
		
		String number = KymsContacts.getNumber(name_to_find);
		System.out.println("Kayla Hawkins' number: " + number);
		
		try 
		{
			KymsContacts.deleteEntry(name_to_delete);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try 
		{
			KymsContacts.deleteEntry(name_to_add);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		KymsContacts.addEntry(name_to_delete, "9876543");
		
	}

}