package cmstodo;


public class CourseDetails {
	
	private int courseId;
    private String courseName;
    private String course_provider;
    private int course_duration;
    private float course_cost;

    public CourseDetails(){

    }
    public CourseDetails(int courseId, String courseName, String course_provider, int course_duration, float course_cost) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.course_provider = course_provider;
        this.course_duration = course_duration;
        this.course_cost = course_cost;
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

    public String getCourse_provider() {
        return course_provider;
    }

    public void setCourse_provider(String course_provider) {
        this.course_provider = course_provider;
    }

    public int getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(int course_duration) {
        this.course_duration = course_duration;
    }

    public float getCourse_cost() {
        return course_cost;
    }

    public void setCourse_cost(float course_cost) {
        this.course_cost = course_cost;
    }

    @Override
    public String toString() {
        return "Course Details{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", course_provider='" + course_provider + '\'' +
                ", course_duration=" + course_duration +
                ", course_cost=" + course_cost +
                '}';
    }
    
    
    
    
    

}
