import java.util.ArrayList;

class Lecturer extends Incrementation {

  private ArrayList<Course> courses = new ArrayList<>();

  public Lecturer (String name) {
    super(name);
  }

  public ArrayList<Course> getCourses() {
    return courses;
  }

  public void addCourse(Course course) {
    courses.add(course);
  }

}