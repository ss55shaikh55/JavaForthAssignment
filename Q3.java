
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// WAP to find "2552" is palindrome or not 123321
		//

		String s = "243515342";
		boolean isPalindrome = true;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - (1 + i))) {
				isPalindrome = false;
				System.out.println("Given String is not palindrome " + isPalindrome);
				break;
			}
		}

		if (isPalindrome) {
			System.out.println("Given String is Palindrome " + isPalindrome);
		}

	}

}
