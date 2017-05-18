package com.ys.yspider.core.request;

import java.util.Collection;

/**
 * @author zhangyong
 */
public abstract class AbstractURLPool implements URLPool {

    protected Collection<String> urls;

    public boolean isEmpty() {
        return urls.isEmpty();
    }
}
