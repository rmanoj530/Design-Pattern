package accessmodifier;

import introtoOOP.Student;

public class intelligentstudent extends Student {
    public intelligentstudent(String newname, int newage) {
        super(newname, newage);
    }

    void somemethod()
    {
        System.out.println(name);
        System.out.println(age);
        //System.out.println(id); inaccessible
        //System.out.println(salary); inaccessible
    }
}
