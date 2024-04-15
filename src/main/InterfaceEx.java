package main;

import lib.PhoneInterface;
import lib.SamsungPhone;

public class InterfaceEx {
    public static void main(String[] args) {
        PhoneInterface phone = new SamsungPhone();
        phone.printLogo();
        phone.sendCall();
        phone.receiveCall();
    }
}
