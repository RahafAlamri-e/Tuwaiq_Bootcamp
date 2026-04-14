package week03.projectTask;

public class Course {
    private String courseName;
    private String className;
    private String courseTime;

    public Course() {
    }

    public Course(String courseName, String className, String courseTime) {
        this.courseName = courseName;
        this.className = className;
        this.courseTime = courseTime;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setCourseTime(String courseTime) {
        this.courseTime = courseTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getClassName() {
        return className;
    }

    public String getCourseTime() {
        return courseTime;
    }
}
