package com.mabrle.designpatterns.observer;

/**
 * 观察接口 需要接受消息的机构实现
 */
public interface Observer {
    /**
     * 获取twitter的特别消息
     */
    void notify(String tweet);
}
