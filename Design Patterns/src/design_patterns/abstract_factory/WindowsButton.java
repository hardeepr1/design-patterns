package design_patterns.abstract_factory;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created windows button");
    }
}
