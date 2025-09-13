package DesignPattern.FactoryDP;

import DesignPattern.FactoryDP.component.button.AndroidButton;
import DesignPattern.FactoryDP.component.button.Button;

public class Android extends Platform {
    @Override
    public UIComponentFactory getUIComponentFactory() {
        return new AndroidComponentFactory();
    }
}
