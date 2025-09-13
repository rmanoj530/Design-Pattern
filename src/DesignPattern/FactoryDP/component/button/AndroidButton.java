package DesignPattern.FactoryDP.component.button;

public class AndroidButton implements Button {
    @Override
    public void click() {
        System.out.println("clicked AndroidButton");
    }
}
