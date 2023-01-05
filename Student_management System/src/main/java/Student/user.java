
package Student;


import java.util.Scanner;

/**
 *
 * @author sonal mishra
 */
public class user {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        StudentDAO dao=new StudentDAO();
        System.out.println("Student Management application");
        while(true){
            System.out.println("\n1.Add Student" +
                    "\n2.Show All Students+" +
                    "\n3.Access student based on roll number+" +
                    "\n4.Remove Student"+
                    "\n5.Update Student" +
                    "\n6.Exit");
            System.out.println("Enter operation choice");
            int s=sc.nextInt();
            switch (s){
                case 1:
                    System.out.println("Add Student");
                    System.out.println("Enter student name");
                    String name=sc.next();
                    System.out.println("Enter student clg name");
                    String clgName=sc.next();
                    System.out.println("Enter city");
                    String city=sc.next();
                    System.out.println("Enter overall Percentage");
                    double percentage=sc.nextDouble();
                    Student st=new Student(name,clgName,city,percentage);
                    boolean ans=dao.insertStudent(st);
                    if(ans)
                        System.out.println("Record inserted Successfully!!!");
                    else
                        System.out.println("something went wrong, please try again");
                    break;
                case 2:
                    System.out.println("Show all students ");
                    dao.showAllStudent();
                    break;
                case 3:
                    System.out.println("Get student based on rollnumber");
                    System.out.println("enter roll number");
                    int roll=sc.nextInt();
                  boolean f=  dao.showStudentById(roll);
                  if(!f)
                      System.out.println("Student with this id is not available in our system");

                    break;
                case 4:
                    System.out.println("Delete Student");
                    System.out.println("enter roll number to delete");
                    int rollnum=sc.nextInt();
                    boolean ff=dao.delete(rollnum);
                    if(ff)
                        System.out.println("Record deleted successfully...");
                    else
                        System.out.println("Something went wrong");
                    break;
                case 5:
                    System.out.println("Update  student Data");
                    System.out.println("\n1.Update name\n2.Update clgName");
                    System.out.println("enter your choice");
                    int choice=sc.nextInt();
                    if(choice==1){
                        System.out.println("Enter roll number");
                        int rnum=sc.nextInt();
                        System.out.println("Enter new name");
                        String sname=sc.next();
                        Student std=new Student();
                        std.setName(sname);
                      boolean flag=  dao.update(rnum,sname,choice,std);
                      if(flag)
                          System.out.println("Name updated successfully");
                      else
                          System.out.println("Something went wrong...");
 }
                    break;
                case 6:
                    System.out.println("Thank You");
                    System.exit(0);
                default:
                    System.out.println("Please enter valid choice..");
            }
        }


    }
}
