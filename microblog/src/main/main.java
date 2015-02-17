package main;

import java.util.Date;

import base.Post;
import base.User;

public class main {
	public static void main(String[] args) {
		User user = new User(0, "Derek", "derekwong_2001@hotmail.com");
		Date date = new Date();
		String content = "Hello!!I am Derek!!";
		Post post = new Post(date, content, user);
		System.out.println(post.toString());
	}
}
