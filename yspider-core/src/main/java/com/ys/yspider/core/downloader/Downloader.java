package com.ys.yspider.core.downloader;

/**
 * 网页下载器
 * @author zhangyong
 */
public interface Downloader {

    /**
     * 通过URL地址下载html源代码
     * @param url URL地址
     * @return html源代码
     */
    String download(String url);

}
