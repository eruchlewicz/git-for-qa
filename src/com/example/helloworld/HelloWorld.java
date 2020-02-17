package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("What's your name?");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        User user = new User(name);
        System.out.println(String.format("Hello %s!", user.getName()));
        System.out.println("Change name:");
        String newName = s.next();
        user.setName(newName);
        System.out.println(String.format("Hello %s!", user.getName()));
    }
}
