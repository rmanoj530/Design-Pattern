package DesignPattern.FactoryDP;

import DesignPattern.FactoryDP.component.button.AndroidButton;
import DesignPattern.FactoryDP.component.button.Button;
import DesignPattern.FactoryDP.component.button.IOSButton;
import DesignPattern.FactoryDP.component.dropdown.AndroidDropdown;
import DesignPattern.FactoryDP.component.dropdown.DropDown;
import DesignPattern.FactoryDP.component.dropdown.IOSDropdown;

public class Client {
    public static void main(String[] args) {
        Platform p = new IOS();
        UIComponentFactory uiComponentFactory = p.getUIComponentFactory();
        Button button = uiComponentFactory.createButton();
        DropDown dropDown = uiComponentFactory.createDropDown();

        button.click();
        dropDown.showOptions();
    }
}
