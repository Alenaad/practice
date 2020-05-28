import java.util.*;

class Course extends Incrementation {

  private ArrayList<Student> students = new ArrayList<>();
  private Lecturer lecturer;

  public Course(String name) {
    super(name);
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public Lecturer getLecturer() {
    return lecturer;
  }
  
  public void assignLecturer(Lecturer lecturer) {
    this.lecturer = lecturer;
  }

}