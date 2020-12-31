package design_patterns.facade;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile result){
        System.out.println("Audio Mixed: fixing audio");
        return new File("temp");
    }
}
