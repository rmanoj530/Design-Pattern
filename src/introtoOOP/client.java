package introtoOOP;

public class client {

    public static void main(String[] args) {
        Student s1 = new Student("validname", 20);
//        s1.id = 1;
//        s1.name = "John";
//        s1.age = 18;
//        //s1.salary = 5000; // inaccessible private member
//        s1.setSalary(5000);

        Student s2 = new Student("validname", 20);
        s2.id = 2;
        s2.name = "Jane";
        s2.age = 19;

         System.out.println(s1.name);
    }
}
