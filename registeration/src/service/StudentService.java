package service;

import model.ActionStatus;
import model.CourseInstance;

/**
 * Interface for the student service
 */
public interface StudentService {

    /**
     * Student registration for a course. Registration is possible under the following conditions:
     * - The course has not yet started;
     * - The course is intended for the category of the given student (master/bachelor);
     * - The student has completed all mandatory courses required for attending the given course;
     * - There are available seats in the course.
     *
     * @param studentId Student's identifier
     * @param courseId Course identifier, corresponding to CourseInstance.id
     * @return Registration result
     */
    ActionStatus subscribe(long studentId, long courseId);

    /**
     * Cancellation of student registration for a course, possible only if
     * the course has not yet started.
     *
     * @param studentId Student's identifier
     * @param courseId Course identifier, corresponding to CourseInstance.id
     * @return Result of the unsubscription
     */
    ActionStatus unsubscribe(long studentId, long courseId);

    /**
     * @param studentId Student's identifier
     * @return List of all courses to which the student is subscribed
     */
    CourseInstance[] findAllSubscriptionsByStudentId(long studentId);
    
}