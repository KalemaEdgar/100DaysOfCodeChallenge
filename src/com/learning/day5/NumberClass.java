package com.learning.day5;

public class NumberClass {
    public static void main(String[] args) {
        Integer a = 40;

        System.out.println("Converting a Number object (Integer a = 40) to a primitive datatype");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("From a Number object to a byte value" + a.byteValue());
        System.out.println("From a Number object to a double value" + a.doubleValue());
        System.out.println("From a Number object to a float value" + a.floatValue());
        System.out.println("From a Number object to an int value" + a.intValue());
        System.out.println("From a Number object to a long value" + a.longValue());

        System.out.println("\nComparisons on a Number object (Integer a = 40)");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("With a lower number yields - " + a.compareTo(20));
        System.out.println("With the same number yields - " + a.compareTo(40));
        System.out.println("With a higher number yields - " + a.compareTo(60));

        System.out.println("\nCheck if the Number object is equal to the argument");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("With a lower number yields - " + a.equals(20));
        System.out.println("With the same number yields - " + a.equals(40));
        System.out.println("With a higher number yields - " + a.equals(60));

        System.out.println("\nUtilising valueOf method. Returns the relevant Number Object holding the value of the argument passed");
        System.out.println("-----------------------------------------------------------------------");
        Integer x = Integer.valueOf(9);
        Double c = Double.valueOf(5);
        Float d = Float.valueOf("80");
        Integer b = Integer.valueOf("444",16); // Converts 444 from base 16(hex) to base 10 (decimal)
        System.out.println(x);
        System.out.println(c);
        System.out.println(d);
        System.out.println(b);

        System.out.println("\ntoString() - used to get a String object representing the value of the Number Object");
        System.out.println("-----------------------------------------------------------------------");
        Integer population = 30;
        System.out.println(population.toString());
        System.out.println(Integer.toString(40));

        System.out.println("\nceil() and floor() methods");
        System.out.println("-----------------------------------------------------------------------");
        double g = -100.675;
        float f = -90;
        System.out.println("Ceil response for " + g + " is " + Math.ceil(g));
        System.out.println("Ceil response for " + f + " is " + Math.ceil(f));
        System.out.println("Floor response for " + g + " is " + Math.floor(g));
        System.out.println("Floor response for " + f + " is " + Math.floor(f));
    }
}
