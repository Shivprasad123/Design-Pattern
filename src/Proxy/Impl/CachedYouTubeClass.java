package Proxy.Impl;

import Proxy.IYouTubeLib;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachedYouTubeClass implements IYouTubeLib {

    IYouTubeLib iYouTubeLib;
    List<String> listCache;
    Map<Integer, String> videoMap = new HashMap<>();

    public CachedYouTubeClass(IYouTubeLib lib){
        this.iYouTubeLib = lib;
    }

    @Override
    public List<String> listVideos() {
        if(listCache == null){
            listCache = iYouTubeLib.listVideos();
        }else{
            System.out.println("-----Listing Response from Proxy-----");
        }
        return listCache;
    }

    @Override
    public String getVideoInfo(int id) {
        if(!videoMap.containsKey(id)){
            String videoInfo = iYouTubeLib.getVideoInfo(id);
            videoMap.put(id, videoInfo);
        }else{
            System.out.println("-----Getting Response from Proxy-----");
        }
        return videoMap.get(id);
    }
}
