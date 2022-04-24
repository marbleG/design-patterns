package com.mabrle.designpatterns.observer;

import org.springframework.util.StringUtils;

/**
 * 观察者清单
 */
class NYTimes implements Observer {
    @Override
    public void notify(String tweet) {
        if (StringUtils.hasText(tweet) && tweet.contains("money")) {
            System.out.println("Breaking news in NY!" + tweet);
        }
    }
}

class Guardian implements Observer {
    @Override
    public void notify(String tweet) {
        if (StringUtils.hasText(tweet) && tweet.contains("queen")) {
            System.out.println("Yet more news from london!" + tweet);
        }
    }
}

class LeMonde implements Observer {
    @Override
    public void notify(String tweet) {
        if (StringUtils.hasText(tweet) && tweet.contains("wine")) {
            System.out.println("Today cheese,wine and news!" + tweet);
        }
    }
}
