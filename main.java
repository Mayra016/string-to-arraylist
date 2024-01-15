import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main
{
	public static void main(String[] args) {
	     System.out.println(setLetters("works"));
	     System.out.println(arrayToString(setLetters("works")));
	}
	
	public static ArrayList<Character> setLetters(String word) {
	    ArrayList<Character> letters = new ArrayList<>();
    	    IntStream.range(0,word.length())
    		.forEach(i -> letters.add(word.charAt(i)));
    	    return letters;	
	}
	
	public static String arrayToString(ArrayList<Character> letters) {
            StringBuilder word = new StringBuilder();
            IntStream.range(0, letters.size())
                .forEach(i -> word.append(letters.get(i)));
            return word.toString();    
        }	
    
}
