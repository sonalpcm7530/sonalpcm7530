/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author sonal mishra
 */

import java.sql.*;
public class StudentDAO extends StudentDAOinterface{
    
    public boolean insertStudent(Student s) {
        boolean flag=false;
        try{
            Connection con= DBconnection.createConnection();
            String query="insert into student_details(sname,clgname,city,percentage) value(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1,s.getName());
            pst.setString(2,s.getClgName());
            pst.setString(3,s.getCity());
            pst.setInt(4, (int) s.getPercentage());
            pst.executeUpdate();
            flag=true;

        }
        catch (SQLException ex){
        }
        return flag;
    }

    public boolean delete(int roll_no) {
        boolean flag=false;
        try{
            Connection con=DBconnection.createConnection();
            String query="delete from student_details where rollnum="+roll_no;
            PreparedStatement pst=con.prepareStatement(query);
            pst.executeUpdate();
            flag=true;

        }
        catch (SQLException e){
        }
        return flag;
    }

    public boolean update(int roll_no, String update, int ch, Student s) {
        int choice=ch;
        boolean flag=false;
        try{
            if(choice==1){
                Connection con=DBconnection.createConnection();
                String query="update student_details set sname=? where rollnum=?";
                PreparedStatement ps=con.prepareStatement(query);
                ps.setString(1,update);
                ps.setInt(2,roll_no);
                ps.executeUpdate();
                flag=true;

            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return flag;
    }

    public void showAllStudent() {
        try{
            Connection con=DBconnection.createConnection();
            String query="select * from studentdata";
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("RollNumber: "+rs.getInt(2)+"\n" +
                        "Name: "+rs.getString(50)+"\n" +
                        "Clg name: "+rs.getString(10)+"\n" +
                        "City: "+rs.getString(10)+"\n" +
                        "Percentage: "+rs.getInt(10));
                System.out.println("----------------------------------");

            }

        }
        catch (SQLException ex){
        }

    }

    public boolean showStudentById(int roll_no) {
        boolean flag=false;
        try{
            Connection con=DBconnection.createConnection();
            String query="select * from studentdata where rollnum="+roll_no;
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){
                System.out.println("RollNumber: "+rs.getInt(2)+"\n" +
                        "Name: "+rs.getString(50)+"\n" +
                        "Clg name: "+rs.getString(10)+"\n" +
                        "City: "+rs.getString(10)+"\n" +
                        "Percentage+"+rs.getDouble(10));
                flag=true;
            }
        }
        catch (SQLException ex){
        }
        return flag;
    }
    public boolean insertStudent(Object s) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    public boolean update(int roll, String update, int ch, Object s) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
