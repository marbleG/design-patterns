package com.mabrle.designpatterns.template;

public class Test {
    public static void main(String[] args) {
        Student student = new StudentSmall();
        student.write();

        OnlineBanking xw = new OnlineBanking();
        xw.processCustomer(1,(customer)-> System.out.println("xw服务"+customer+"感觉不错"));

        xw.processCustomer(2,(customer)-> System.out.println("icbc服务"+customer+"感觉垃圾"));
    }
}
