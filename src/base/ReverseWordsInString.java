package base;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String inputString = "Pinu is my guggu";
        String reversedString = reverseWords(inputString);
        System.out.println("Original string: " + inputString);
        System.out.println("Reversed string: " + reversedString);
    }

    public static String reverseWords(String inputString) {
        String[] words = inputString.split("\\s+");
        StringBuilder reversedString = new StringBuilder();
        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversedString.append(reversedWord.reverse()).append(" ");
        }
        return reversedString.toString().trim();
    }

	

}
