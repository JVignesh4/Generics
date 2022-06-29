package com.blz.generics;

public class Main {
    public static void main(String[] args) {
        Integer maxInt=testMaximumNumber(9, 3, 6);
        Float maxFloat=testMaximumNumber(9.4f, 3.5f, 9.9f);
        String maxString= testMaximum("Apple"  , "Peach", "Banana");
        System.out.println("maximum integer is: "+maxInt);
        System.out.println("maximum float is: "+maxFloat);
        System.out.println("maximum String is: "+maxString);
    }

    private static Integer testMaximumNumber(Integer first, Integer second, Integer third) {
        Integer max = first;
        if(second.compareTo(max)>0)
            max=second;
        if(third.compareTo(max)>0)
            max=third;
        return max;
    }

    private static String testMaximum(String first, String second, String third) {
        String max = first;
        if(second.compareTo(max)>0)
            max=second;
        if(third.compareTo(max)>0)
            max=third;
        return max;
    }

    private static Float testMaximumNumber(Float first, Float second, Float third) {
        Float max = first;
        if(second.compareTo(max)>0)
            max=second;
        if(third.compareTo(max)>0)
            max=third;
        return max;
    }
}

