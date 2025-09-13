package DesignPattern.FactoryDP.component.button;

public class IOSButton implements Button {
    @Override
    public void click() {
        System.out.println("clicked IOSButton");
    }
}
