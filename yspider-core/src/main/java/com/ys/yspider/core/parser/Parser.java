package com.ys.yspider.core.parser;

/**
 * 网页解析器
 * @author zhangyong
 */
public interface Parser {

    /**
     * 解析html
     * @param html html源代码
     */
    void parse(String html);

}
