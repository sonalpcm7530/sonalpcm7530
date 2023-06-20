package com.bmpl.chat.views;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
public class UserView extends JFrame{
	int cntr;
	//JFrame f=new JFrame();
	//JLabel l1;
	//JButton b1;
	public UserView() {
		cntr=0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setResizable(true);
		setTitle("Login");
		setLocationRelativeTo(null);
		
		JLabel welcome=new JLabel("Login");
		welcome.setFont(new Font("Arial",Font.BOLD,40));
		Container contain=this.getContentPane();
		contain.setLayout(null);
		welcome.setBounds(200,70,200,60);
		contain.add(welcome);
		JButton b1=new JButton("Count");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				cntr++;
				welcome.setText("Count"+cntr);
			}
		});
		b1.setBounds(100,300,200,50);
		contain.add(b1);
		setVisible(true);
		
	}
	public static void main(String[]args) {
		UserView user=new UserView();
	}
	

}
