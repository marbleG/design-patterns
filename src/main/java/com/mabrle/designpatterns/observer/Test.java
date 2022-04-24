package com.mabrle.designpatterns.observer;

public class Test {
    public static void main(String[] args) {
        Feed feed = new Feed();
        feed.registerObserver(new NYTimes());
        feed.registerObserver(new Guardian());
        feed.registerObserver(new LeMonde());

        String tweet = "Today is a big day,queen die.";
        feed.notifyObservers(tweet);
    }
}
