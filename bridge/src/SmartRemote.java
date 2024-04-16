public class SmartRemote extends AdvancedRemote {
    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl() {
        System.out.println("Remote: voice control activated, please speak into the mic");
    }
}
