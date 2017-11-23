package kz.bekmuratov.patterns.structural.facade.some_complex_media_library;

import java.io.File;

/**
 * Микширование аудио
 */
public class AudioMixer {
    public static File fix(VideoFile result){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
