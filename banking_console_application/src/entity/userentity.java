package entity;

public class userentity {
	private String username;
	private String password;
	private String contact;
	private String role;
	private double acount_balance;
	
	 public userentity(String username,String password,String contact,String role,double acount_balance)
		{
		 this.setUsername(username);
		 this.setPassword(password);
		 this.setContact(contact);
		 this.setRole(role);
		 this.setAcount_balance(acount_balance);
		}
	 public String getUsername() {
		 return username;
	 }
	 public void setUsername(String username) {
		 this.username = username;
	 }
	 public String getPassword() {
		 return password;
	 }
	 public void setPassword(String password) {
		 this.password = password;
	 }
	 public String getContact() {
		 return contact;
	 }
	 public void setContact(String contact) {
		 this.contact = contact;
	 }
	 public String getRole() {
		 return role;
	 }
	 public void setRole(String role) {
		 this.role = role;
	 }
	 public double getAcount_balance() {
		 return acount_balance;
	 }
	 public void setAcount_balance(double acount_balance) {
		 this.acount_balance = acount_balance;
	 }
//	 to print as list without using this it will print the reference variables 
	@Override
	public String toString() {
		return "userentity [username=" + username + ", password=" + password + ", contact=" + contact + ", role=" + role
				+ ", acount_balance=" + acount_balance + "]";
	}
	 
	 
	

}
