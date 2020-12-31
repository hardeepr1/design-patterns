package design_patterns.singleton;

public class NaiveSingleton {
    public String value;
    private static NaiveSingleton instance;

    private NaiveSingleton(String value){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static NaiveSingleton getInstance(String value){
        if(instance == null){
            instance = new NaiveSingleton(value);
        }
        return instance;
    }
}
