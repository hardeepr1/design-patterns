package design_patterns.abstract_factory;

public class WindowsCheckbox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox");
    }
}
