import java.util.ArrayList;

class Institution {

  private final String name;
  private final String address;
  private ArrayList<Course> courses = new ArrayList<>();
  private ArrayList<Student> students = new ArrayList<>();
  private ArrayList<Lecturer> lecturers = new ArrayList<>();

  public Institution(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public ArrayList<Student> getStudents() {
    return students;
  }

  public ArrayList<Lecturer> getLecturers() {
    return lecturers;
  }

  public ArrayList<Course> getCourses() {
    return courses;
  }

  public void addStudent(Student student) {
    students.add(student);
  }

  public void addLecturer(Lecturer lecturer) {
    lecturers.add(lecturer);
  }

  public void addCourse(Course course) {
    courses.add(course);
  }

  public Lecturer getLecturer(int id) {
    return lecturers.stream().filter(x -> x.getId() == id).findAny().get();
  }

  public Student getStudent(int id) {
    return students.stream().filter(x -> x.getId() == id).findAny().get();
  }

  public Course getCourse(int id) {
    return courses.stream().filter(x -> x.getId() == id).findAny().get();
  }
  
  public void lecturerForCourseAssign(Lecturer lecturer, Course course) {
    lecturer.addCourse(course);
    course.assignLecturer(lecturer);
  }
  
  public void studentForCourseAssociate(Student student, Course course) {
    student.addCourse(course);
    course.addStudent(student);
  }

}