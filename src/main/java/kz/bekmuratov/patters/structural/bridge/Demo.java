package kz.bekmuratov.patters.structural.bridge;

import kz.bekmuratov.patters.structural.bridge.devices.Device;
import kz.bekmuratov.patters.structural.bridge.devices.Radio;
import kz.bekmuratov.patters.structural.bridge.devices.Tv;
import kz.bekmuratov.patters.structural.bridge.remotes.AdvancedRemote;
import kz.bekmuratov.patters.structural.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
