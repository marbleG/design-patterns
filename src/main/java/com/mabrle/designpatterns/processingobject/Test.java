package com.mabrle.designpatterns.processingobject;

public class Test {
    public static void main(String[] args) {
        ProcessingObject<String> headerTextProcessing = new HeaderTextProcessing();
        ProcessingObject<String> spellCheckerProcessing = new SpellCheckerProcessing();
        ProcessingObject<String> headerTextProcessing1 = new HeaderTextProcessing();
        spellCheckerProcessing.setSuccessor(headerTextProcessing1);
        headerTextProcessing.setSuccessor(spellCheckerProcessing);
        System.out.println(headerTextProcessing.handle("Marble是个垃圾"));
    }
}
