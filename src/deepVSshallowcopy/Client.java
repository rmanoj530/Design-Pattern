package deepVSshallowcopy;

public class Client {
    public static void main(String[] args) {

        Student st = new Student();
        st.id = 1;
        st.name = "john doe";
        st.age = 101;
        st.setSalary(1800);
        st.enrolledexam = new Exam();

        //feasible method1
        Student stcopy = new Student();
        stcopy.id = st.id;
        stcopy.name = st.name;
        stcopy.age = st.age;
        stcopy.setSalary(st.getSalary()); // only if access mutators are present

        //feasible method 2
        Student stCopyCopy = new Student(st);

        System.out.println("");
    }
}
