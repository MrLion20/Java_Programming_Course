package capitulo8;

public class TextProcessor {


    public static void main (String[] args){
        countWords("I love Test Automation University");
    }

    /**
     * This Splits a String into an array by tokenizing it
     * Counts words and prints them
     * @param text Full string to be slit
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your Text Contains %d words: ", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }

    }
}
