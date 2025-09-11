package deepVSshallowcopy;

public class Student {
    int id;
    public String name;
    protected int age;
    private int salary;
    Exam enrolledexam;
    Batch batch;

    public Student() {

    }

    //copy constructor
    public Student(Student s) {
        id = s.id;
        name = s.name;
        age = s.age;
        salary = s.salary;
        //shallow copy
        //enrolledexam = s.enrolledexam;
        //deep copy
        enrolledexam = new  Exam(s.enrolledexam);
        batch = s.batch;
        batch = new Batch(s.batch);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
