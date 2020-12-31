package design_patterns.singleton;

public class DemoSingleton {
    public static void main(String[] args){
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        NaiveSingleton singleton = NaiveSingleton.getInstance("FOO");
        NaiveSingleton anotherSingleton = NaiveSingleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
