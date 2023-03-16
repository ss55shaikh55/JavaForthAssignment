import java.util.ArrayList;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to remove duplicates form the given string take any string with duplicate
		// values;

		String s = "Sahil Shaikh";
		String ans = "";
		ArrayList<Character> ch = new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) != s.charAt(j) && !ch.contains(s.charAt(i)) && (s.charAt(i)) != ' ') {
//					ans = ans + s.charAt(i);
					ch.add(s.charAt(i));
				}
			}
		}

		System.out.println("Solution is " + ch);

	}

}
