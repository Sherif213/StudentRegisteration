package model;

/**
 * Class for information about a student
 */
public class Student extends Person {

    /**
     * List of identifiers of courses (CourseInstance.id) completed by the student
     */
    private long[] completedCourses;

    // TODO: Add getters and setters

    public long[] getCompletedCourses(){
        return this.completedCourses;
    }
    public void setCompletedCourses(long[] completedCourses){
        this.completedCourses=completedCourses;
    }

    
    
}
