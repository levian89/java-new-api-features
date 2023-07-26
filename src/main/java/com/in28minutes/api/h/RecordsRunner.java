package com.in28minutes.api.h;

record Person(String name, String email, String phoneNumber) {
    //    Person(String name, String email, String phoneNumber) {
//        if(name == null) {
//            throw new IllegalArgumentException("name is null");
//        }
//        this.name=name;
//        this.email=email;
//        this.phoneNumber=phoneNumber;
//    }  or
    Person {            // this is called a compact constructor, and are only allowed in records
        if (name == null) {
            throw new IllegalArgumentException("name is null");
        }
    }

    public String name() {  // custom name() method created
        System.out.println("Do something");
        return name;
    }
}

public class RecordsRunner {
    public static void main(String[] args) {
        Person person = new Person("Ranga","ranga@in28minutes.com","123-456-7890");
        Person person1 = new Person("Ranga","ranga@in28minutes.com","123-456-7890");
        Person person2 = new Person("Ranga1","ranga@in28minutes.com","123-456-7890");
//        Person person3 = new Person(null,"ranga@in28minutes.com","123-456-7890");
        System.out.println(person);
        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));
        System.out.println(person.name());
    }
}
