package Proxy;

import DesignPattens.IDesignPattern;
import Proxy.Impl.CachedYouTubeClass;
import Proxy.Impl.YouTubeClass;

public class ProxySample implements IDesignPattern {
    @Override
    public void run() {
        IYouTubeLib youTubeService = new YouTubeClass();
        IYouTubeLib youTubeProxy = new CachedYouTubeClass(youTubeService);

        YouTubeManager manager = new YouTubeManager(youTubeProxy);
        manager.renderList();
        manager.renderList();
        manager.renderVideoPage(1);
        manager.renderVideoPage(1);
    }
}
