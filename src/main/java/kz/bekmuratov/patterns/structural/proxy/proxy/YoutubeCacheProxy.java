package kz.bekmuratov.patterns.structural.proxy.proxy;

import kz.bekmuratov.patterns.structural.proxy.media_library.ThirdPartyYoutubeClass;
import kz.bekmuratov.patterns.structural.proxy.media_library.ThirdPartyYoutubeLib;
import kz.bekmuratov.patterns.structural.proxy.media_library.Video;

import java.util.HashMap;

/**
 * Сервисный класс для работы с кешем
 */
public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YoutubeCacheProxy(){
        this.youtubeService = new ThirdPartyYoutubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos(){
        if(cachePopular.isEmpty()){
            cachePopular = youtubeService.popularVideos();
        }else {
            System.out.print("Retrieved list from cache");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId){
        Video video = cacheAll.get(videoId);
        if(video == null){
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        }else {
            System.out.print("Retrieved video '"+videoId+"' from cache.");
        }
        return video;
    }

    public void reset(){
        cachePopular.clear();
        cacheAll.clear();
    }
}
