![Диаграмма](http://www.plantuml.com/plantuml/png/VSr12W8n30NG_PoY5-WT1bmDkFC4iOrQQ5D9Vi3ZYvIYYnbtuVz7_ceWXRUwqDMWb11I9REmIL9kB22KBii8B_3CWi0liEG3TEgknl_DcHDSMO_K9eO2_zoXHt_6ERtJZBsTOeuiGuHO-ORlfvbgkJ_merUMxAs-0G00)

import java.util.*;

class Main {

 public static void main(String[] args) {
 Institution institution = new Institution("СПТ", "г. Саранск");
    
 institution.addCourse(new Course("ИЗО"));
 
 institution.addCourse(new Course("Русский язык"));
 
 institution.addCourse(new Course("Математика"));

 institution.addLecturer(new Lecturer("Руссичка"));
 
 institution.addLecturer(new Lecturer("Математик"))
 
 institution.addLecturer(new Lecturer("Руссичка Фёдоровна Наталия Леонидова"));

 institution.addStudent(new Student("Аверкин Антон Иванович"));
 
 institution.addStudent(new Student("Магомедов Пётр Русланович"));
 
 institution.addStudent(new Student("Михайлов Алексей Владимирович"));

 for( int i =  1; i <  4; i++) { 
 new LecturerForCourseAssigner(institution.getLecturer(i), institution.getCourse(i)).assign();
 for( int j =  1; j <  4; j++) { 
 new StudentForCourseAssigner(institution.getStudent(j), institution.getCourse(i)).assign();
 }
 }

 Student s =  institution.getStudent(1);
 System.out.println();
 System.out.println(s.getName() + " изучает предметы:");
 s.getCourses().forEach(c - > >  System.out.println(c.getName()));

 System.out.println("\nпредмет " + institution.getCourse(1 ) .getName() + " изучают:\n");
 institution.getCourse(1 ) .getStudents().forEach(st - > >  System.out.println(st.getName()));
 
 System.out.println("\nпредмет " + institution.getCourse(3 ) .getName() + " ведёт:");
 System.out.println(institution.getCourse(3 ) .getLecturer().getName());
  }
  
}

[Выполнить программу](https://SleepyForestgreenDimension.aduskinaalena.repl.run)
