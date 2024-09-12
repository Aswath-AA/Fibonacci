public class MiddleCharacter {
    public static void main(String[] args) {
        String str = "Hello, world!"; // Replace with your desired string

        int length = str.length();
        int middleIndex = length / 2;

        if (length % 2 == 0) {
            // Even length: Display the two middle characters
            System.out.println("Middle characters: " + str.charAt(middleIndex - 1) + str.charAt(middleIndex));
        } else {
            // Odd length: Display the single middle character
            System.out.println("Middle character: " + str.charAt(middleIndex));
        }
    }
}
