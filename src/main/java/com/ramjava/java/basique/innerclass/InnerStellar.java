package com.ramjava.java.basique.innerclass;

class Outside {
    int a = 0;

    static class Inside {
        int b = 5;
    }
}

public class InnerStellar {
    public static void main(String[] args) {
        //var o = new Outside();
        //Outside.Inside i = o.new Inside();
        var i = new Outside.Inside();
        //System.out.println(o.a + " " + i.b);
        System.out.println(i.b);
    }
}
