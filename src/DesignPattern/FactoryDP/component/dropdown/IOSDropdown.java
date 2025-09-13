package DesignPattern.FactoryDP.component.dropdown;

public class IOSDropdown implements DropDown {
    @Override
    public void showOptions() {
        System.out.println("IOSDropdown show options");
    }
}
