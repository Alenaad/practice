import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.*;
import static java.nio.charset.StandardCharsets.UTF_8;


class Main {
  public static void main(String[] args) throws IOException {
    Institution institution = new Institution("СПТ", "г. Саранск");
    
    Files.readAllLines(Paths.get("res/students.txt"), UTF_8)
      .forEach(s -> institution.addStudent(new Student(s)));
      
    Files.readAllLines(Paths.get("res/lecturers.txt"), UTF_8)
      .forEach(l -> institution.addLecturer(new Lecturer(l)));
      
    Files.readAllLines(Paths.get("res/courses.txt"), UTF_8)
      .forEach(c -> institution.addCourse(new Course(c)));
      
      System.out.println("\nсписок студентов:");
      institution.getStudents().forEach(System.out::println);
      System.out.println("\nсписок преподавателей:");
      institution.getLecturers().forEach(System.out::println);
      System.out.println("\nсписок предметов:");
      institution.getCourses().forEach(System.out::println);
      
      institution.getStudents().forEach(s -> institution.studentForCourseAssociate(s, institution.getCourse(11)));
      
      System.out.println("\nКол-во студентов, изучающих курс литературы: ");
      System.out.println(institution.getCourse(11).getStudents().size());
  }
}