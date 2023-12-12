package model;

import java.io.IOException;

import reader.StudentDataReader;

/**
 * Class for basic information about a course
 */
public class CourseInfo {

    /**
     * Course identifier
     */
    private long id;

    /**
     * Course name
     */
    private String name;

    /**
     * Brief description of the course
     */
    private String description;

    /**
     * List of identifiers for courses that must be completed before the start of this course
     */
    private long[] prerequisites;

    /**
     * List of student categories eligible to attend the course
     */
    private StudentCategory[] studentCategories;

    // TODO: Add getters and setters

    public long getId(){
        return this.id;
    }
    public void setId(long id){
        this.id=id;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description=description;
    }

    //prerequisites
    public long[] getPrerequisites(){
        return this.prerequisites;
    }
    public void setPrerequisites(long[] prerequisites){
        this.prerequisites=prerequisites;
    }

    public StudentCategory[] getStudentCategories(){
        return this.studentCategories;
    }
    public void setStudentCategories(StudentCategory[] studentCategories){
        this.studentCategories=studentCategories;
    }


    CourseInfo(){

    }
    public void printCourses() throws IOException{
        StudentDataReader reader = new StudentDataReader();
        CourseInfo[] courseInfos = reader.readCourseInfoData();
        System.out.println("Courses Available");
        int i=1;
        for(CourseInfo course:courseInfos){
            System.out.println((i++)+": "+course.getName()+" and it's id is "+course.getId());
        }
    }
    public void showDescription(long id) throws IOException{
        StudentDataReader reader = new StudentDataReader();
        CourseInfo[] courseInfos = reader.readCourseInfoData();
        for(CourseInfo course:courseInfos){
            if(course.getId()==id){
                System.out.printf("Description of course (%s) is : %s",course.getId(), course.getDescription());
            }
        }
    }



}
