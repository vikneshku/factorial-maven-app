package com.example;

public class App {

    // Returns n! (n factorial). Example: 5! = 5 x 4 x 3 x 2 x 1 = 120
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n > 20) {
            throw new IllegalArgumentException("Number too large (result would overflow long)");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    // Lets you run the program directly: java -cp target/classes com.example.App 5
    public static void main(String[] args) {
        int number = -1;
        if (args.length > 0) {
            number = Integer.parseInt(args[0]);
        }
        App app = new App();
        System.out.println("Factorial of " + number + " = " + app.factorial(number));
    }
}