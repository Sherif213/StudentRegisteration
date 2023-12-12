
import model.ActionStatus;
import model.CourseInfo;
import model.CourseInstance;
import model.Instructor;
import model.Student;
import model.StudentCategory;
import reader.StudentDataReader;
import service.StudentService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws IOException{
        ArrayList<Student> registeredStudent =new ArrayList<>();
        try {
            StudentDataReader reader = new StudentDataReader();
            Student[] bachelorStudents = reader.readBachelorStudentData();
            Student[] masterStudents = reader.readMasterStudentData();
            CourseInstance[] courseDetails = reader.readCourseInstanceData();
            CourseInfo[] courseInfo = reader.readCourseInfoData();
            CourseInstance courseOne = new CourseInstance();
            StudentCategory Bachelor = StudentCategory.BACHELOR;
            StudentCategory Master = StudentCategory.MASTER;
            Scanner input = new Scanner(System.in);
            
            System.out.println("Are you a Bachelor Student [1]  or Master Student [2]");
            
            int choice= input.nextInt();

            if(choice==1){
                // for (Student student : bachelorStudents) {
                //     registeredStudent.add(student);   
                //     System.out.println(student.getId());
                    
                // }
                // courseOne.showInfo(10123);
                
                // reader.addNewData(registeredStudent);
                
                for (CourseInfo course : courseInfo) {
                    for(StudentCategory categories : course.getStudentCategories()){
                        if(categories.equals(Bachelor)){
                            System.out.println(course.getId());
                        }
                    }
                    
                }
                
            }else if(choice==2){
                for (CourseInfo course : courseInfo) {
                    for(StudentCategory categories : course.getStudentCategories()){
                        if(categories.equals(Master)){
                            System.out.println(course.getId());
                        }
                    }
                    
                }
            }

            
            
            input.close();



        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception appropriately
        }
    }
    


    
}
