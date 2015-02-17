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
	
}
