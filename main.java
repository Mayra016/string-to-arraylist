import java.util.ArrayList;
import java.util.stream.IntStream;

public class Main
{
	public static void main(String[] args) {
		System.out.println(setLetters("works"));
	}
	
	public static ArrayList<Character> setLetters(String word) {
	    ArrayList<Character> letters = new ArrayList<>();
    	    IntStream.range(0,word.length())
    			.forEach(i -> letters.add(word.charAt(i)));
    	return letters;		
    }
}
