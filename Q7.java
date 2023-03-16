
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		// WAP to find if String contain unique character or not
		String str = "SAHIL SHAIKH";
		
		
		boolean isUnique = false;
		char ch = 'z';
		
		outer:  for (int i = 0; i < str.length(); i++) {
			
			for (int j = i+1; j < str.length(); j++ ) {
				if (str.charAt(i) == str.charAt(j)) {
					isUnique = true;
					ch = str.charAt(i);
//					break;
					break outer;
				}
				
			}
		}
		
		System.out.println("character "+ch + " is repeated");
		System.out.println("isUnique :"+isUnique);
		

	}

}
