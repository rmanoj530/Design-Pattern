package deepVSshallowcopy;

public class Batch {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Batch() {}

    public Batch(Batch s) {
        this.id = s.id;
        this.name = s.name;
    }


}
