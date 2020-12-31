package design_patterns.abstract_factory;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created Mac button");
    }
}
