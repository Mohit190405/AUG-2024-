public class VariableDemo {
    public static void main(String[] args) {
        // Primitive data types
        byte byteValue = 127;               // 8-bit signed integer
        short shortValue = 10000;           // 16-bit signed integer
        int intValue = 100000;             // 32-bit signed integer
        long longValue = 100000L;          // 64-bit signed integer
        float floatValue = 3.14f;          // Single-precision floating-point number
        double doubleValue = 3.14159265358979; // Double-precision floating-point number
        char charValue = 'A';              // 16-bit Unicode character
        boolean booleanValue = true;      // Boolean value (true or false)

        // Reference data types
        String stringValue = "Hello, World!"; // String (a sequence of characters)
        int[] arrayValue = {1, 2, 3, 4, 5};   // Array of integers

        // Printing the values
        System.out.println("Byte Value: " + byteValue);
        System.out.println("Short Value: " + shortValue);
        System.out.println("Int Value: " + intValue);
        System.out.println("Long Value: " + longValue);
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Char Value: " + charValue);
        System.out.println("Boolean Value: " + booleanValue);
        System.out.println("String Value: " + stringValue);
        
        System.out.println("Array Value: ");
        for (int num : arrayValue) {
            System.out.print(num + " ");
        }
    }
}
