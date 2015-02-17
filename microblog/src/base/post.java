package base;

import java.util.Date;

public class post {

	private Date date;
	private String content;
	
	//constructer
	public post(Date date, String content){
		this.date = date;
		this.content = content;
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
		post Post = (post) o ;
		if(!o.toString().equals(this.toString())){
			return false;
		}
		return ans;
	}
}
