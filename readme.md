![Диаграмма](http://www.plantuml.com/plantuml/png/VSr12W8n30NG_PoY5-WT1bmDkFC4iOrQQ5D9Vi3ZYvIYYnbtuVz7_ceWXRUwqDMWb11I9REmIL9kB22KBii8B_3CWi0liEG3TEgknl_DcHDSMO_K9eO2_zoXHt_6ERtJZBsTOeuiGuHO-ORlfvbgkJ_merUMxAs-0G00)

import java.util.*;

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
