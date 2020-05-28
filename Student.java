import java.util.ArrayList;

class Student extends Incrementation {

  private ArrayList<Course> courses = new ArrayList<>();

  public Student(String name) {
    super(name);
  }

  public ArrayList<Course> getCourses() {
    return courses;
  }

  public void addCourse(Course course) {
    courses.add(course);
  }

}