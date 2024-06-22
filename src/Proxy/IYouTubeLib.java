package Proxy;

import java.util.List;

public interface IYouTubeLib {

    public List<String> listVideos();

    public String getVideoInfo(int id);
}
