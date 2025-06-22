package repository;
import java.util.*;
import java.util.stream.Collectors;

import entity.userentity;
public class userRepository {
		private static  Set<userentity> userlist=new HashSet<>();
		static//can also be done inside the constructor
		{
		userentity ue=new userentity("dhanu","dhanu","759889445","admin",100000.00);
		userentity ue1=new userentity("dhanush","dhanushree","7598894453","user1",100000.00);
		userentity ue2=new userentity("dhanushreee","shree","7598894455","user2",100000.00);
		userentity ue3=new userentity("mw","mw","95852023","user3",1000.00);
		
		userlist.add(ue);
		userlist.add(ue1);
		userlist.add(ue2);
		userlist.add(ue3);
		}
		public void Print()
		{
			System.out.println(userlist);
		}
		public userentity Login(String username,String password)
		{
			List<userentity> end=userlist.stream().filter(user->user.getUsername().equals(username)
					&&user.getPassword().equals(password)).collect(Collectors.toList());
			if(!end.isEmpty())
			{
//				System.out.print(end.get(0));
				return end.get(0);
			}
			else
			{
				System.out.print("Wrong Password or Username!! Try Again..");
				
				
				return null;
			}
		}
//		 
//<3<3

}
		
		
