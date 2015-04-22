package socket;

import java.net.*;
import java.io.*;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String serverName = "msr.cse.ust.hk";
		int port = 3021;
		try {
			System.out.println("Connecting to " + serverName + " on port "
					+ port);
			Socket client = new Socket(serverName, port);
			System.out.println("Just connected to "
					+ client.getRemoteSocketAddress());
			OutputStream outToServer = client.getOutputStream();
			DataOutputStream out = new DataOutputStream(outToServer);

			out.writeUTF("20116398");
			InputStream inFromServer = client.getInputStream();
			DataInputStream in = new DataInputStream(inFromServer);
			System.out.println("Server says " + in.readUTF());
			
			
			
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
