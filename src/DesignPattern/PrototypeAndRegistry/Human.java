package PrototypeAndRegistry;

public class Human implements Prototype<Human> {
    private String name;
    private String color;
    private int intelligent;

    public Human(String name, String color, int intelligent) {
        this.name = name;
        this.color = color;
        this.intelligent = intelligent;
    }

    public Human(Human other) {
        this.name = other.name;
        this.color = other.color;
        this.intelligent = other.intelligent;
    }

    @Override
    public Human copy() {
        return new Human(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIntelligent(int intelligent) {
        this.intelligent = intelligent;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", intelligent=" + intelligent +
                '}';
    }
}
