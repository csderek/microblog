package base;

import java.util.Date;

public class Post {

	private Date date;
	private String content;
	private User user;
	
	//constructer
	public Post(Date date, String content, User user){
		this.date = date;
		this.content = content;
		this.user = user;
	}
	
	public String getcontent(){
		return content;
	}
	
	public void setcontent(String content){
		this.content = content;
	}
	
	public Date getdate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public User getUser(){
		return user;
	}
	
	public void setUser(User user){
		this.user = user;
	}
	
	public String toString(){
		return user.toString() + "\n" + date + "\n" + content;
	}
	
	public boolean contains(String str){
		if (this.content.indexOf(str) < 0){
			return false;
		}else{
			return true;
		}
	}
	public boolean equals(Object o){
		boolean ans = true;
		if(o == null){
			return false;
		}
		if(!this.getClass().equals(o.getClass())){
			return false;
		}
		Post post = (Post) o ;
		if(post.toString().equals(this.toString())){
			return false;
		}
		return ans;
	}
}
