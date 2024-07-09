package com.example;

public class App {
    public String getGreeting() {
        return "Hello, World!";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.getGreeting());
        System.out.println("5 + 3 = " + app.add(5, 3));
        System.out.println("5 - 3 = " + app.subtract(5, 3));
        System.out.println("Is 4 even? " + app.isEven(4));
    }
}
