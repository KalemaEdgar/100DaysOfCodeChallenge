package com.learning.day1;

public class FreshJuiceTest {
    public static void main(String[] args) {
        ///// Declaring enum inside another class FreshJuice /////
        // FreshJuice juice = new FreshJuice();
        // juice.size = FreshJuice.FreshJuiceSize.SMALL;
        // System.out.println(juice.size);

        // When I switch to declaring the enum on its own
        FreshJuiceSize juiceSize = FreshJuiceSize.MEDIUM;
        System.out.println(juiceSize);
    }
}

//class FreshJuice {
//    enum FreshJuiceSize {SMALL, MEDIUM, LARGE}
//    FreshJuiceSize size;
//}

enum FreshJuiceSize {
    SMALL, MEDIUM, LARGE;
}