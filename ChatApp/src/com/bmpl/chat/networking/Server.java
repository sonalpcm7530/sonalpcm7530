package com.bmpl.chat.networking;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import com.bmpl.chat.utils.ConfigReader;
public class Server {
	ServerSocket serversocket;
	public Server() throws IOException{
		int PORT=Integer.parseInt(ConfigReader.getValue("PORTNO"));
		serversocket=new  ServerSocket(PORT);
		System.out.println("Server Started and waiting for client connection");
		Socket socket=serversocket.accept();
		System.out.println("Client joins the server");
		InputStream in=socket.getInputStream();
		byte arr[]=in.readAllBytes();
		String str=new String(arr);
		System.out.println("MSG rec from client"+str);
		in.close();
		socket.close();
	}
	public static void main(String[] args) throws IOException{
		Server server=new Server();
	}
	

}
