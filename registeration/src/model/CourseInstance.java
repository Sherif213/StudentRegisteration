package model;

import java.io.IOException;
import java.time.LocalDate;
import reader.StudentDataReader;
/**
 * Class with data about a course instance. A single course (e.g., Discrete Mathematics) can be conducted multiple times.
 */
public class CourseInstance {
    
    /**
     * Identifier of the course instance
     */
    private long id;

    /**
     * Identifier of the course, corresponding to CourseInfo.id
     */
    private long courseId;

    /**
     * Instructor's identifier
     */
    private long instructorId;

    /**
     * Start date of the course
     */
    private LocalDate startDate;

    /**
     * Limit on the number of students for the course
     */
    private int capacity;

    // TODO: Add getters and setters

    public long getId(){
        return this.id;
    }

    public void setId(long id){
        this.id=id;
    }

    public long getCourseId(){
        return this.courseId;
    }
    public void setCourseId(long courseId){
        this.courseId=courseId;
    }

    public long getInstructorId(){
        return this.instructorId;
    }
    public void setInstructorId(long instructorId){
        this.instructorId=instructorId;
    }
    
    public LocalDate getStartDate(){
        return this.startDate;
    }
    public void setStartDate(LocalDate startDate){
        this.startDate=startDate;
    }
    
    public int getCapacity(){
        return this.capacity;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    
    public void showInfo(long courseChosenId) throws IOException{
        StudentDataReader reader = new StudentDataReader();
        CourseInstance[] courseDetails = reader.readCourseInstanceData();

        for(CourseInstance courseInfo: courseDetails){
            if(courseInfo.getCourseId()==courseChosenId){
                System.out.println(courseInfo.getId());
                System.out.println(courseInfo.getStartDate());
            }
        }
    }
}
