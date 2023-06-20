package com.bmpl.chat.networking;
import java.io.*;
import java.util.*;

import javax.swing.JTextArea;

import java.net.Socket;
import java.net.UnknownHostException;

import com.bmpl.chat.utils.ConfigReader;
public class Client {
	Socket socket;
	OutputStream outputStream ;
	JTextArea textArea;
	public Client() throws UnknownHostException,IOException{
		int PORT=Integer.parseInt(ConfigReader.getValue("PORTNO"));
		socket=new Socket(ConfigReader.getValue("SERVER_IP"),PORT);
		System.out.println("Client comes");
		System.out.println("Enter the msg to send to server");
		Scanner scanner=new Scanner(System.in);
		String message=scanner.nextLine();
		OutputStream out=socket.getOutputStream();
		out.write(message.getBytes());
		System.out.println("Message send to the server");
		scanner.close();
		out.close();
		socket.close();
	}
	public Client(JTextArea textArea) {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) throws UnknownHostException, IOException {
		Client client=new Client();
	}
	public void sendMessage(String message) throws IOException {
		message = message +"\n";
		outputStream.write(message.getBytes());
	}
	

}
