package PrototypeAndRegistry;

public class StudentUtil {
    public static void doCopy(Student student) {
//        Student copyStudent;
//        if(student instanceof IntelligentStudent) {
//            copyStudent = new IntelligentStudent((IntelligentStudent) student);
//            System.out.println(copyStudent.getName());
//        } else if(student instanceof Student) {
//            copyStudent = new Student(student);
//            System.out.println(copyStudent.getName());
//        } else{
//            throw new IllegalArgumentException("Student type not supported");
//        }

        Student copystudent = student.copy();
        System.out.println(copystudent.getName());
    }
}
