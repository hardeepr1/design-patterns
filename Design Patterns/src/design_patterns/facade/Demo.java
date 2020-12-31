package design_patterns.facade;
import java.io.File;
public class Demo {
    public static void main(String[] args){
        VideoConversionFacade conversionFacade = new VideoConversionFacade();
        File mp4Video = conversionFacade.convertVideo("youtube.ogg", "mp4");
    }
}
