
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
