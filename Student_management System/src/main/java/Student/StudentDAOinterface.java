/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author sonal mishra
 */
public class StudentDAOinterface {
    public interface StudentDaoInterface {
    public boolean insertStudent(Student s);
    public boolean delete(int roll_no);
    public boolean update(int roll_no,String update,int ch,Student s);
    public void showAllStudent();
    public boolean showStudentById(int roll_no);
}
}
