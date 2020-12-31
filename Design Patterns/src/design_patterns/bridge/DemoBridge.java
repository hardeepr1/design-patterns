package design_patterns.bridge;

public class DemoBridge {
    public static void main(String[] args){
        System.out.println("Testing tv with basic remote");
        Device device = new Tv();
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Testing tv with advanced remote");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

}
