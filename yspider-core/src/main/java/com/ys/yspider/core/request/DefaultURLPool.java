package com.ys.yspider.core.request;

import java.util.HashSet;

/**
 * @author zhangyong
 */
public class DefaultURLPool extends AbstractURLPool {

    public DefaultURLPool() {
        super();
        urls = new HashSet<>();
    }

    @Override
    public String out() {
        if (isEmpty())
            return null;
        String url = urls.stream().findFirst().get();
        urls.remove(url);
        return url;
    }
}
