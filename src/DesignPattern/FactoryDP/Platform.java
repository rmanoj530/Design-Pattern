package DesignPattern.FactoryDP;

import DesignPattern.FactoryDP.component.button.Button;
import DesignPattern.FactoryDP.component.dropdown.DropDown;

public abstract class Platform {
    public void setRefresh(){
        System.out.println("Platform set refresh");
    }

    public abstract UIComponentFactory getUIComponentFactory();
}
