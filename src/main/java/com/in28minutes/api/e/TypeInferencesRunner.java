package com.in28minutes.api.e;

import java.util.List;
import java.util.stream.Stream;

public class TypeInferencesRunner {
    public static void main(String[] args) {
        List<String> names1 = List.of("Ranga", "Ravi");
        List<String> names2 = List.of("John", "Adam");
        var names3 = List.of(names1,names2);
        var names4 = List.of(names1,names2);
        var names5 = List.of(names3, names4);
        names3.stream().forEach(System.out::println);
        names5.stream().forEach(System.out::println);

//        var abc = null;
        var var = ""; // var is NOT a keyword

        for(int i=1; i<=10; i++) {
            System.out.println(i);
        }

        for(var i=1; i<=10; i++) {  // I can use var
            System.out.println(i);
        }

        for (String name:names1) {
            System.out.println(name);
        }

        for (var name:names1) {  // I can use var
            System.out.println(name);
        }

        for (List<String> name:names3) {
            System.out.println(name);
        }

        for (var name:names3) { // I can use var
            System.out.println(name);
        }

        Stream<String> filter = List.of("Ranga", "Ravi").stream().filter(s -> s.length() < 5);
        filter.forEach(System.out::println);

        var filter1 = List.of("Ranga", "Ravi").stream().filter(s -> s.length() < 5);
        filter1.forEach(System.out::println);
    }
}
