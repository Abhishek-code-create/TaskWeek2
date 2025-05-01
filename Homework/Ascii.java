// Create a method that accepts a character and returns its ASCII value

public class Ascii {
    public static int getAsciiValue(char ch) {
        return (int) ch; // yesle character ko ascii value dinxa.
    }
    public static void main(String[] args) {
        char input = 'A'; 
        int ascii = getAsciiValue(input);
        System.out.println("ASCII value of '" + input + "' is: " + ascii);
    }
}
