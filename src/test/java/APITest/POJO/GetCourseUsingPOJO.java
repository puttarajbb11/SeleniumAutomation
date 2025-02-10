package APITest.POJO;

public class GetCourseUsingPOJO {
    private String url;
    private String services;
    private String expertise;
    private CoursesPOJO courses;
    private String instructor;
    private String linkedIn;

    // Getter and Setter for url
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Getter and Setter for services
    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    // Getter and Setter for expertise
    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    // Getter and Setter for courses
    public CoursesPOJO getCourses() {
        return courses;
    }

    public void setCourses(CoursesPOJO courses) {
        this.courses = courses;
    }

    // Getter and Setter for instruction
    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instruction) {
        this.instructor = instruction;
    }

    // Getter and Setter for linkedIn
    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }
}

