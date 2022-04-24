package com.mabrle.designpatterns.processingobject;

public class SpellCheckerProcessing extends ProcessingObject<String> {

    @Override
    protected String handleWork(String input) {
        return input.replaceAll("垃圾", "帅哥");
    }
}
