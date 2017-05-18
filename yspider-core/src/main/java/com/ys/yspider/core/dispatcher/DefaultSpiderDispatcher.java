package com.ys.yspider.core.dispatcher;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.ys.yspider.core.downloader.DefaultDownloader;
import com.ys.yspider.core.downloader.Downloader;
import com.ys.yspider.core.request.DefaultURLPool;
import com.ys.yspider.core.request.URLPool;

/**
 * @author zhangyong
 */
public class DefaultSpiderDispatcher implements SpiderDispatcher {

    private String startUrl;

    public DefaultSpiderDispatcher() {
    }

    public DefaultSpiderDispatcher(String startUrl) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(startUrl), "startUrl 不能为空！");
        this.startUrl = startUrl;
    }

    public void dispatch() {
        Preconditions.checkNotNull(startUrl, "startUrl 不能为空！");
        URLPool urlPool = new DefaultURLPool();
        urlPool.into(startUrl);
        Downloader downloader = new DefaultDownloader();
        downloader.download(urlPool.out());
    }

    public void setStartUrl(String startUrl) {
        this.startUrl = startUrl;
    }
}
