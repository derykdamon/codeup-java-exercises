import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Write some Java code that uses the variable pi to output the following: The value of pi is
        // approximately 3.14. Don't change the value of the variable; instead, reference one of the links
        // above and use System.out.format to accomplish this.
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        // Explore the Scanner Class
        // 1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        // What happens if you input something that is not an integer? We get an exception timeout break for input mismatch
        System.out.print("Enter an integer: ");
        int userInputInt = scanner.nextInt();
        System.out.println("You entered: " + userInputInt);

        // Clear the scanner buffer
        scanner.nextLine();

        // 2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in
        // the console, each on a newline.
        // What happens if you enter less than 3 words? it waits for a third.
        // What happens if you enter more than 3 words? it only displays the first three
        System.out.print("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println(word1 + "\n" + word2 + "\n" + word3);

        // Clear the scanner buffer
        scanner.nextLine();

        // 3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
        // Then, display that sentence back to the user.
        // Do you capture all the words? No, only the first one.
        System.out.print("Enter a sentence: ");
        String sentenceUsingNext = scanner.next();
        System.out.println("You entered: " + sentenceUsingNext);

        // Clear the scanner buffer
        scanner.nextLine();

        // 4. Rewrite the above example using the nextLine() method.
        System.out.print("Enter another sentence: ");
        String sentenceUsingNextLine = scanner.nextLine();
        System.out.println("You entered: " + sentenceUsingNextLine);

        // Calculate the perimeter and area of a classroom
        // 1. Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
        // Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the
        // user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
        // Assume that the rooms are perfect rectangles
        // Assume that the user will enter valid numeric data for length and width.
        System.out.print("Enter the length of the room: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the width of the room: ");
        double width = Double.parseDouble(scanner.nextLine());

        // 2. Display the area and perimeter of that classroom. Calculating area and perimeter
        // The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to
        // 2 times the length plus 2 times the width.
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);



        // Bonuses
        // In your perimeter/area calculator:
        // Accept decimal entries.
        // Calculate the volume of the rooms in addition to the area and perimeter.

        // The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input
        // with the useDelimiter method. Add the following line of code to your application after you have created a
        // scanner (assuming the variable holding the Scanner is named scanner):

        // Using custom delimiter
        //scanner.useDelimiter("\n");

        // Start of bonus code for perimeter/area calculator using custom delimiter scanner.useDelimiter("\n");
        scanner.useDelimiter("\n");

        // Bonus version using nextDouble
        System.out.print("Enter the length of the room (bonus): ");
        double roomLength = scanner.nextDouble();

        System.out.print("Enter the width of the room (bonus): ");
        double roomWidth = scanner.nextDouble();

        // Calculating area and perimeter (bonus)
        double roomArea = roomLength * roomWidth;
        double roomPerimeter = 2 * (roomLength + roomWidth);
        System.out.println("Area (bonus): " + roomArea);
        System.out.println("Perimeter (bonus): " + roomPerimeter);

        // Calculating volume (bonus)
        System.out.print("Enter the height of the room (bonus): ");
        double roomHeight = scanner.nextDouble(); // Using nextDouble
        double roomVolume = roomLength * roomWidth * roomHeight;
        System.out.println("Volume (bonus): " + roomVolume);

        // Closing scanner
        scanner.close();
    }
}