package base;

public class User {
	private int id;
	private String username;
	private String useremail;
	
	//constructer
	public User(int id, String username, String useremail){
		this.id = id;
		this.useremail = useremail;
		this.username = username;
	}
	
	public void setid(int id){
		this.id = id;
	}
	
	public int getid(){
		return id;
	}
	
	public String getUsername(){
		return username;	
	}
	
	public void setUsername(String name){
		username = name;
	}
	
	public String getUseremail(){
		return useremail;
	}
	
	public void setUseremail(String email){
		useremail = email;
	}
	
	public String toString(){
		return "ID: " + id + "\nUsername: " + username + "\nUseremail: " + useremail;
	}
}
