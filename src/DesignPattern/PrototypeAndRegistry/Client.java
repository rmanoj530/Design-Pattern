package PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        Student student = new Student("Rohit", 23, 57);
        Student student2 = new Student(student);

        IntelligentStudent intelligentStudent = new IntelligentStudent("Intelligent Rohit", 23, 90, 105);
        //IntelligentStudent intelligentStudent2  = new IntelligentStudent(intelligentStudent);
        StudentUtil.doCopy(student);
        StudentUtil.doCopy(intelligentStudent);

        HumanRegistry humanRegistry = new HumanRegistry();

        Human masterElf = humanRegistry.get(RaceType.Elf);
        masterElf.setName("Legolas");

        Human masterOrc = humanRegistry.get(RaceType.Orc);
        masterOrc.setName("Thrall");

        Human masterBob = humanRegistry.get(RaceType.Bob);
        masterBob.setName("Walker");

        System.out.println(masterElf);
        System.out.println(masterOrc);
        System.out.println(masterBob);
    }
}
