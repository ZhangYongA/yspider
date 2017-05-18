package com.ys.yspider.core.request;

/**
 * URL管理器
 * @author zhangyong
 */
public interface URLPool {

    /**
     * 判断是否还有待爬取的URL
     * @return true or false
     */
    boolean isEmpty();

    /**
     * 从URL管理器中获取一个URL，并从URL管理器中删除
     * @return URL地址
     */
    String out();

    /**
     * 将URL地址放入到URL管理器中
     * @param url URL地址
     * @return 添加是否成功
     */
    boolean into(String url);

}
