package DesignPattern.FactoryDP;

import DesignPattern.FactoryDP.component.button.Button;
import DesignPattern.FactoryDP.component.button.IOSButton;
import DesignPattern.FactoryDP.component.dropdown.DropDown;
import DesignPattern.FactoryDP.component.dropdown.IOSDropdown;

public class IOSComponentFactory implements UIComponentFactory{

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropdown();
    }
}
