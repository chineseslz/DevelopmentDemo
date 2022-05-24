package usbInterface;

public class MainUsb {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.powerOn();

        USB mouse = new Mouse();
        USB keyBoard = new Keyboard();

        computer.useDevice(mouse);
        computer.useDevice(keyBoard);

        computer.powerOff();

    }
}
