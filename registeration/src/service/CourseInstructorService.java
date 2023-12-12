package service;

import model.Instructor;
import model.ActionStatus;
import model.Student;

/**
 * Interface for the instructor service
 */
public interface CourseInstructorService {
    
    /**
     * @param courseId Course identifier
     * @return List of students registered for the given course
     */
    Student[] findStudentsByCourseId(long courseId);

    /**
     * @param instructorId Instructor's identifier
     * @return List of students attending one of the courses taught by the given instructor
     */
    Student[] findStudentsByInstructorId(long instructorId);

    /**
     * @param instructorId Instructor's identifier
     * @param courseId Course identifier
     * @return List of instructors who can teach the given course instead of the specified instructor
     */
    Instructor[] findReplacement(long instructorId, long courseId);

}
