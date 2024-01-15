/**
 * CollegeCourse class acts as a blueprint for a college course.
 */
public class CollegeCourse {
    // State - instance variables
    private int courseReferenceNumber;
    private int courseNumber;

    // Constructors
    public CollegeCourse() {
        this.courseReferenceNumber = 0;
        this.courseNumber = 0;
    }

    public CollegeCourse(int courseReferenceNumber, int courseNumber) {
        this.courseReferenceNumber = courseReferenceNumber;
        this.courseNumber = courseNumber;
    }

    // Getters and Setters
    public int getCourseReferenceNumber() {
        return courseReferenceNumber;
    }

    public void setCourseReferenceNumber(int courseReferenceNumber) {
        this.courseReferenceNumber = courseReferenceNumber;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }
}