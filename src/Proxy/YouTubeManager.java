package Proxy;

import Proxy.IYouTubeLib;

import java.util.List;

public class YouTubeManager {

    private IYouTubeLib youTubeLib;

    YouTubeManager(IYouTubeLib lib){
        this.youTubeLib = lib;
    }

    public String renderVideoPage(int id){
        return youTubeLib.getVideoInfo(id);
    }

    public List<String> renderList(){
        return youTubeLib.listVideos();
    }
}
