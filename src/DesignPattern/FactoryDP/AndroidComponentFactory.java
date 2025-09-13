package DesignPattern.FactoryDP;

import DesignPattern.FactoryDP.component.button.AndroidButton;
import DesignPattern.FactoryDP.component.button.Button;
import DesignPattern.FactoryDP.component.dropdown.AndroidDropdown;
import DesignPattern.FactoryDP.component.dropdown.DropDown;

public class AndroidComponentFactory implements UIComponentFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropdown();
    }
}
