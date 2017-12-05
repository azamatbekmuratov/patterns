package kz.bekmuratov.patterns.structural.proxy.media_library;

import java.util.HashMap;

/**
 * Интерфейс удалённого сервиса
 */
public interface ThirdPartyYoutubeLib {
    public HashMap<String, Video> popularVideos();

    public Video getVideo(String videoId);
}
