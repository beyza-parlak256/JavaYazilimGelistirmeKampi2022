package kodlama.iodemo.entities;
public class Course {
    private int courseId;
    private String courseName;
    private int coursePrice;
    private String courseDescription;
    private boolean courseCompleted;
    
    public Course() {
        super();
    }

    public Course(int courseId, String courseName, int coursePrice, String courseDescription, boolean courseCompleted) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.courseDescription = courseDescription;
        this.courseCompleted = courseCompleted;
    }
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public boolean isCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(boolean courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
    
}
