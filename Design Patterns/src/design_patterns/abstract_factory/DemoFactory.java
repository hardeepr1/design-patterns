package design_patterns.abstract_factory;

public class DemoFactory {

    private static Application configureApplication(){
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOSFactory();
        }else{
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args){
        Application app = configureApplication();
        app.paint();
    }
}
