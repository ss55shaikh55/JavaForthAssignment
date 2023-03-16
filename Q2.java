import java.util.ArrayList;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to find duplicates characters from the string

		String s = "Sahil Shaikh";

		ArrayList<Character> ch = new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j) && !ch.contains(s.charAt(i))) {
					ch.add(s.charAt(i));

					break;
				}
			}
		}

		System.out.println(ch);

	}

}
