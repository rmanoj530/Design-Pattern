package DesignPattern.FactoryDP;

import DesignPattern.FactoryDP.component.button.AndroidButton;
import DesignPattern.FactoryDP.component.button.Button;
import DesignPattern.FactoryDP.component.button.IOSButton;
import DesignPattern.FactoryDP.component.dropdown.AndroidDropdown;
import DesignPattern.FactoryDP.component.dropdown.DropDown;
import DesignPattern.FactoryDP.component.dropdown.IOSDropdown;

public class Client {
    public static void main(String[] args) {
        Platform p = new Android();
        Button button = p.createButton();
//        DropDown dropDown;

//        if(p instanceof Android){
//            button = new AndroidButton();
//        } else if (p instanceof IOS) {
//            button = new IOSButton();
//        } else{
//            throw new IllegalArgumentException("Platform type is not supported");
//        }

//        if(p instanceof Android){
//            dropDown = new AndroidDropdown();
//        } else if(p instanceof IOS){
//            dropDown = new IOSDropdown();
//        } else {
//            throw new IllegalArgumentException("Platform type is not supported");
//        }

        button.click();
//        dropDown.showOptions();
    }
    //HW: move this logic to other class, and implement simple factory
}
