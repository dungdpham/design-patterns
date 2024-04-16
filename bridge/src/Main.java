public class Main {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());

        SmartTv smartTv = new SmartTv();
        testDevice(smartTv);
        smartTv.browseInternet();
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

        System.out.println("Test with smart remote.");
        SmartRemote smartRemote = new SmartRemote(device);
        smartRemote.power();
        smartRemote.mute();
        smartRemote.voiceControl();
        device.printStatus();
    }
}
