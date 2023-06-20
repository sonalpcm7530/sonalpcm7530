package com.bmpl.chat.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bmpl.chat.dto.UserDTO;
import com.bmpl.chat.utils.Encryption;

public class UserDAO {
	public boolean isLogin(UserDTO userDTO) throws SQLException,ClassNotFoundException, Exception{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		final String SQL="select userid from users where userid=? and password=?";
				 try{
				 con=CommonDAO.createConnection();
				pstmt=con.prepareStatement(SQL);
				 pstmt.setString(1, userDTO.getUserid());
				 		String encryptedPwd = Encryption.passwordEncrypt(new String(userDTO.getPassword()));
				 	pstmt.setString(2, encryptedPwd);
						rs = pstmt.executeQuery();
						return rs.next();
				
				
	}
		finally {
			if(rs!=null) {
				rs.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}}
		}
		public int add(UserDTO userDTO) throws ClassNotFoundException, SQLException,Exception {
			System.out.println("Receive "+userDTO.getUserid()+ " "+userDTO.getPassword());
			Connection connection =null;
			Statement stmt = null; //query
			try { // Guarded region
			connection = CommonDAO.createConnection();  // Step 1 :Connection Created
			stmt = connection.createStatement();
			// insert into users(userid,password) values('ram','ram123');
			int record = stmt.executeUpdate("insert into users (userid,password) values('"+userDTO.getUserid()+"','"+Encryption.passwordEncrypt(new String(userDTO.getPassword()))+"')"); //insert, delete, update
			return record;
			}
			finally { // Always execute
				 if(stmt!=null) {
					 stmt.close();
				 }
				 if(connection!=null) {
					 connection.close();
				}	
		
	}
		}
	

}
