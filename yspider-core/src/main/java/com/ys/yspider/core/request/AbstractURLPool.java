package com.ys.yspider.core.request;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;

import java.util.Collection;

/**
 * @author zhangyong
 */
public abstract class AbstractURLPool implements URLPool {

    protected Collection<String> urls;

    public boolean isEmpty() {
        return urls.isEmpty();
    }

    public boolean into(String url) {
        Preconditions.checkArgument(!Strings.isNullOrEmpty(url), "url不能为空！");
        return urls.add(url);
    }
}
