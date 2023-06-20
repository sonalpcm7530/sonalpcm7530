package com.bmpl.chat.views;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class DashBoard extends JFrame{
	private JPanel contentPane;
	public DashBoard(String message) {
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,1258,669);
		JMenuBar bar=new JMenuBar();
		setJMenuBar(bar);
		
		JMenu chat=new JMenu("Chat");
		bar.add(chat);
		
		JMenuItem start=new JMenuItem("Start Chat");
		chat.add(start);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		setTitle(message);
		
		JLabel l1=new JLabel();
		l1.setBackground(Color.lightGray);
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setIcon(new ImageIcon(DashBoard.class.getResource("/ChatApp/src/com/bmpl/chat/views/icon.jpg")));
		contentPane.add(l1,BorderLayout.CENTER);
		
		
		
		
		
	}

}
