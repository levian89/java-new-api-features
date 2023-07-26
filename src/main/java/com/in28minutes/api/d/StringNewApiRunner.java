package com.in28minutes.api.d;

class SampleClass {
    String str = null;
}

public class StringNewApiRunner {
    public static void main(String[] args) {
        System.out.println("   ".isBlank());
        System.out.println();
        System.out.println(" L R ".strip().replace(" ", "@"));
        System.out.println(" L R ".stripLeading().replace(" ", "@")); // the leading space is removed
        System.out.println(" L R ".stripTrailing().replace(" ", "@")); // the trailing space is removed
        System.out.println();
        System.out.println("Line1\nLine2\nLine3\nLine4");
        System.out.println();
        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

//        System.out.println("UPPER".transform(s->s.substring(2)));
        System.out.println("My name is %s. My age is %d.".formatted("Ranga", 25));
//        String str = null;
//        System.out.println(str.isBlank());
        //Exception in thread "main" java.lang.NullPointerException:
        //Cannot invoke "String.isBlank()" because "str" is null
        //at com.in28minutes.api.d.StringNewApiRunner.main(StringNewApiRunner.java:18)

        SampleClass sample = new SampleClass();
        System.out.println(sample.str.isBlank());
        //Exception in thread "main" java.lang.NullPointerException:
        //Cannot invoke "String.isBlank()" because "sample.str" is null
        //at com.in28minutes.api.d.StringNewApiRunner.main(StringNewApiRunner.java:28)

    }
}
