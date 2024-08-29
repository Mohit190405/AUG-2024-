public class Main {
    // main method
    public static void main(String[] args) {
        // Check if exactly two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as arguments.");
            return;
        }
        
        try {
            // Parse the arguments as integers
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            
            // Add the numbers
            int sum = num1 + num2;
            
            // Print the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
        } catch (NumberFormatException e) {
            // Handle the case where arguments are not valid integers
            System.out.println("Both arguments must be valid integers.");
        }
    }
}