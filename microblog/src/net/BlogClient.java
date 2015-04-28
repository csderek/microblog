package net;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class BlogClient {
	public static final String IP = "127.0.0.1";
	public static final int Port = 3021;
	
	public static void main(String[] args) {
		try{
			Socket blogsocket = new Socket(IP, Port);
			PrintWriter out = new PrintWriter(blogsocket.getOutputStream(), true);
			out.println("Hi!! Everyone!");
		}catch(IOException e){
			System.exit(1);
		}
	}
}
