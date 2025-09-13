package DesignPattern.FactoryDP;

import DesignPattern.FactoryDP.component.button.Button;

public abstract class Platform {
    public void setRefresh(){
        System.out.println("Platform set refresh");
    }

    public abstract Button createButton();

}
