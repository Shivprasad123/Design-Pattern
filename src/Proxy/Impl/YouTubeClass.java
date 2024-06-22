package Proxy.Impl;

import Proxy.IYouTubeLib;

import java.util.ArrayList;
import java.util.List;

public class YouTubeClass implements IYouTubeLib {
    @Override
    public List<String> listVideos() {
        System.out.println("Making List API CALL");
        System.out.println("Got List API CALL Response");
        return new ArrayList<>();
    }

    @Override
    public String getVideoInfo(int id) {
        System.out.println("Making Get API CALL");
        System.out.println("Got Get API CALL Response");
        return "";
    }
}
