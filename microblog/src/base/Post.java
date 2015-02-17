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
	
	public String toString(){
		return date + " " + content;
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
