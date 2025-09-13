package DesignPattern.FactoryDP;

import DesignPattern.FactoryDP.component.button.Button;
import DesignPattern.FactoryDP.component.button.IOSButton;
import DesignPattern.FactoryDP.component.dropdown.DropDown;

import java.awt.*;
import java.util.Calendar;

public interface UIComponentFactory {
    Button createButton();
    DropDown createDropDown();
    //Calendar createCalendar();
    //Menu createMenu();
}
