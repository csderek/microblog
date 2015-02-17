package base;

public class User {
	private int id;
	private String username;
	private String useremail;
	
	public User(int id, String username, String useremail){
		this.id = id;
		this.useremail = useremail;
		this.username = username;
	}
	
	public String toString(){
		return "ID: " + id + " Username: " + username + " Useremail: " + useremail;
	}
}
