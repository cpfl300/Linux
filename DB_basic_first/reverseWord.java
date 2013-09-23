import java.util.ArrayList;

public class reverseWord {
	
	public static void main(String[] args) {
		reverseWord rv = new reverseWord();
		String result = rv.reverse("apple");
		System.out.println(result);
	}

	private String reverse(String word) {
		StringBuilder sb = new StringBuilder();
		ArrayList<String> splitedWords = new ArrayList<String>();
		
		String[] temp = word.split("");
		
		for(String words: temp){
			splitedWords.add(words);
		}
		
		for(int i = (temp.length)-1; i>0 ; i--){
			sb.append(splitedWords.get(i));
		}
		
		return sb.toString();
	}
	
}
