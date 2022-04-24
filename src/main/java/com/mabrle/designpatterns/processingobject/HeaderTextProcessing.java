package com.mabrle.designpatterns.processingobject;

public class HeaderTextProcessing extends ProcessingObject<String> {

    @Override
    protected String handleWork(String input) {
        return "添加处理人:" + input;
    }
}
