public class HelloWorld {
    public static void main(String[] args) {
        // Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 88;
        System.out.println("My favorite number is: " + myFavoriteNumber);

        // Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Java";

        // Change your code to assign a character value to myString.
        //myString = 'S'; // This won't compile because a char is a char and not a string. This is because of single quotes vs double.

        // Change your code to assign the value 3.14159 to myString.
        // myString = 3.14159; //This will not compile because myString is a String type and 3.14159 is a double.

        System.out.println("My string is: " + myString);

        // Declare a long variable named myNumber without assigning anything to it and try to print it.
        // long myNumber; // This will cause a compilation error because the variable is not initialized.
        // System.out.println(myNumber);

        // Assign the value 3.14 to myNumber. This will cause a compilation error because 3.14 is a double with a decimal and myNumber is a long.
        // myNumber = 3.14;

        // Assign the value 123L to myNumber. This will compile because 123L is a valid long literal/declaration.
        // myNumber = 123L;
        // System.out.println("My number is: " + myNumber);

        //Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens?
        // What are two ways we could fix this? we can put a capital F on the back or cast it.
        float myNumber;
        myNumber = 3.14F; // (float) 3.14;
        System.out.println("My number is: " + myNumber);

        // Increment and print variables using postfix and prefix increment operators.
        int x = 5;
        System.out.println(x++); // Outputs 5, then increments x to 6 because we're incrementing after reading
        System.out.println(x);   // Outputs 6

        x = 5; // Reset x to 5
        System.out.println(++x); // Increments x to 6, then outputs 6 because we're incrementing before reading
        System.out.println(x);   // Outputs 6

        // Try to create a variable named class. This will cause a compilation error because class is a reserved word.
        // int class = 5;

        // Object casting
        String theNumberThree = "three";
        Object o = theNumberThree;
        // This will cause a runtime error because you cannot cast a String to an int.
        // int three = (int) o;

        // Rewrite the following expressions using shorthand assignment operators.
        int a = 4;
        a += 5; // a = a + 5;

        int b = 3;
        int c = 4;
        c *= b; // c = c * b;

        int d = 10;
        int e = 2;
        d /= e; // d = d / e;
        e -= d; // e = e - d;

        // Overflow and underflow
        int max = Integer.MAX_VALUE;
        System.out.println(max + 1); // This will overflow and wrap around to Integer.MIN_VALUE
    }
}
