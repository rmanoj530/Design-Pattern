package introtoOOP;

public class Student {
    //data members

    int id;
    public String name;
    protected int age;
    private int salary;

    //default constructor
//    public Student(){
//        id = 0;
//        name = "new student";
//        age = 21;
//        salary = 20000;
//    }

    //parametrised constructor
    public Student(String newname, int newage){
        name = newname;
        age = newage;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int newsalary) {
        if(newsalary < 500){
            System.out.println("salary is too low");
            return;
        }
        salary = newsalary;
    }
    void attendclass()
    {
        System.out.println(name + "is attending class");
    }
}
