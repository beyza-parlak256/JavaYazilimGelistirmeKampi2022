package kodlama.iodemo.entities;

public class Teacher {

    private int teacherId;
    private String firstName;
    private String lastName;
    private String teacherDescription;
    private int numberCourses;

    public Teacher() {
        super();
    }

    public Teacher(int teacherId, String firstName, String lastName, String teacherDescription, int numberCourses) {
        this.teacherId = teacherId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacherDescription = teacherDescription;
        this.numberCourses = numberCourses;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeacherDescription() {
        return teacherDescription;
    }

    public void setTeacherDescription(String teacherDescription) {
        this.teacherDescription = teacherDescription;
    }

    public int getNumberCourses() {
        return numberCourses;
    }

    public void setNumberCourses(int numberCourses) {
        this.numberCourses = numberCourses;
    }

}
