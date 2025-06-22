package com.banking_console_application;

import java.util.*;

import service.userservice;
public class main {
	public static void main(String args[]) {
//starting part
		Scanner sc=new Scanner(System.in);
		userservice userser=new userservice();
		
		System.out.println("enter the username");
		String username=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		
		
		sc.close();
//		userser.print();
		System.out.print(userser.login(username, password));
		
		
		
		
		
		
	}
}
