package com.hackerrank.subclass;

class Person {
    private String f;
    private String l;
    private int id;

    Person(String f, String l, int id) {
        this.f = f;
        this.l = l;
        this.id = id;
    }

    void printPerson() {
        System.out.println("Name: " + l + ", " + f);
        System.out.println("ID: " + id);
    }
}
