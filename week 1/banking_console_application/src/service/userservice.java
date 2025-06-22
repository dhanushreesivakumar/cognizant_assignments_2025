package service;

import entity.userentity;
import repository.userRepository;

public class userservice {
		
			userRepository userrepo=new userRepository();
		
			public void print() {
				userrepo.Print();
			}
			public userentity login(String username,String password){
				return userrepo.Login(username,password);
			}
		
		
	
}
