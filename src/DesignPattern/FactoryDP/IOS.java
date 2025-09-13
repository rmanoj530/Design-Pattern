package DesignPattern.FactoryDP;

import DesignPattern.FactoryDP.component.button.Button;
import DesignPattern.FactoryDP.component.button.IOSButton;

public class IOS extends Platform {
    @Override
    public Button createButton() {
        return new IOSButton();
    }
}
