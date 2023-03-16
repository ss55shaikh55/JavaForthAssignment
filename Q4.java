
public class Q4 {

	public static void countSpecialCharacters(String str) {
		int count = 0;
		int vowelCount = 0;
		int consonantsCount = 0;

		String s = str;

		// Input custom string

		for (int i = 0; i < s.length(); i++) {

			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
				count++;
			} else {
				if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'u') {

					vowelCount++;
				} else {
					consonantsCount++;
				}
			}
		}

		if (count == 0)
			System.out.println("No Special Characters found.");
		else
			System.out.println("String has Special Characters\n" + count + " " + "Special Characters found.");

		System.out.println("The Given String has " + vowelCount + " vowel");
		System.out.println("The Given String has " + consonantsCount + " consonants");
	}

	public void countConsonantsAndVowel(String str) {

		String s = "GeeksForGeeks";
		s = s.toLowerCase();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}
		}

		System.out.println("Total no of vowels in string are: " + count);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WAP to find number of consonants, vowel and special character
//		String s = "!#$GeeeksforGeeks.Computer.Science.Portal!!";
		String s = "fi@s#a";

		countSpecialCharacters(s);

	}

}
