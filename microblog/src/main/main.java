package main;

import java.util.Date;

import base.Friendpost;
import base.Post;
import base.User;

public class main {
	public static void main(String[] args) {
		User user = new User(0, "Derek", "derekwong_2001@hotmail.com");
		Date date = new Date();
		String content = "Hello!!I am Derek!!";
		Post post = new Post(date, content, user);
		System.out.println(post.toString());
		
		
		User user01 = new User(1, "COMP3021", "COMP3021@cse.ust.hk");
		Date d = new Date();
		String content01 = "This is my first post";
		Friendpost postfromfriend = new Friendpost(d, content01, user01);
		System.out.println(postfromfriend.toString());
		
		System.out.println(postfromfriend.contains("first"));
		System.out.println(postfromfriend.contains("HKUST"));
	}
}
