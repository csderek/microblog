package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import base.Post;
import base.User;
import blog.Blog;

public class Testbox {
	public String getInput(){
		String line = "";
		System.out.println("Enter the prompt: ");
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			line = br.readLine();
		}catch(IOException e){
			e.printStackTrace();
		}
		return line;
	}
	public static void main(String[] args) {
		Testbox test = new Testbox();
		User user = new User(1, "COMP3021", "COMP3021@cse.ust.hk");
		Blog myblog = new Blog(user);
		String prumpt = null;
		
		while(!(prumpt = test.getInput()).equals("exit")){
			if (prumpt.startsWith("list")){
				myblog.list();
				
			}else if(prumpt.startsWith("post")){
				Date date = new Date();
				String content = prumpt.substring(5);
				Post post = new Post(date, content);
				myblog.post(post);
				
			}else if(prumpt.startsWith("delete")){
				
				int index = Integer.parseInt(prumpt.substring(7));
				myblog.delete(index);
				
			}
		}
		
	}
}
