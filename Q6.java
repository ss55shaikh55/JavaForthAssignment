import java.util.ArrayList;

public class Q6 {
	
	public static void check2(String str) {
		char [] pangram = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String s = str.toLowerCase();
		
		ArrayList<Boolean> bl = new ArrayList<Boolean>();
		
		for (int i =0 ; i<pangram.length; i++) {
			for (int j = 0; j<s.length(); j++) {
				if(pangram[i] == s.charAt(j)) {
					bl.add(true);
					break;
				}
			}
		}
		
		if(bl.size() >= 26) {
			System.out.println("String is Pangram");
		}else {
			System.out.println("String not pangram");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WAP to find if a string is pangram with least inbuilt method
		
		char [] pangram = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		String inputString = "The quick brown fox jumps over the lazy dog";
		check2(inputString);
		
		String inputString2 = "Sahil Shaikh";
		check2(inputString2);
		
		String inputString3 = "Pack my box with five dozen liquor jugs";
		check2(inputString3);

	}

}
