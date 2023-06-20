package com.bmpl.chat.views;
import com.bmpl.chat.networking.Client;
import com.bmpl.chat.utils.UserInfo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
public class ChatView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3412275455913360071L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea ;
	private Client client ;
	public static void main(String[] args) {
					try {
						@SuppressWarnings("unused")
						ChatView frame = new ChatView();
					} catch (UnknownHostException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	}
	private void sendIt() throws IOException
	{
		String message = textField.getText();
	    client.sendMessage(UserInfo.USER_NAME+" - "+message);
	}
	public ChatView() throws UnknownHostException, IOException {
		textArea = new JTextArea();
		client = new Client(textArea);
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setTitle("Chat Interface");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 6, 546, 252);
		contentPane.add(scrollPane);
		
		
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textArea.setBounds(21, 11, 546, 247);
		scrollPane.setViewportView(textArea);
		
		textField = new JTextField();
		textField.setBounds(20, 288, 410, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Send Message");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					sendIt();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 11));
		btnNewButton.setBounds(440, 293, 126, 23);
		contentPane.add(btnNewButton);
		setVisible(true);
		
	}
	
}
