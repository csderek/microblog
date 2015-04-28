package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class BlogServer {
	
	public static final int Port = 3021;
	
	public static void main(String[] args) {
		try {
			ServerSocket blogserver = new ServerSocket(Port);
			Socket blogsocket = blogserver.accept();
			BufferedReader in = new BufferedReader(new InputStreamReader(blogsocket.getInputStream()));
			String line = in.readLine();
			System.out.print(line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
