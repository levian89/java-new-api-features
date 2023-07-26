package com.in28minutes.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ranga");
        names.add("Ravi");
        names.add("John");
        List<String> copyOfNames = List.copyOf(names); // it makes an Immuttable List of List<String> names


        doNotChange(names);
        System.out.println(names);
        System.out.println(copyOfNames);
        doNotChange(copyOfNames); // it throws an exception because it cannot do an.add method on an Immuttable List
                                  // copyOfNames being part of ImmuttableCollections
        System.out.println(copyOfNames);
    }

    private static void doNotChange(List<String> names) {
        names.add("ShouldNotBeAllowed");
    }
}
