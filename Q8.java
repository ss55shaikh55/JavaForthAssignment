
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi");

		String exa = "SAHIL ANSASRS SHAIKH";

		int occuringCount = 0;
		char res = 't';

		for (int i = 0; i < exa.length(); i++) {
			int itemCount = 0;

			for (int j = 0; j < exa.length(); j++) {
				if (exa.charAt(i) == (exa.charAt(j))) {
					itemCount = itemCount + 1;
				}
			}

			if (itemCount > occuringCount) {
				System.out.println(res);
				res = exa.charAt(i);
				occuringCount = itemCount;
			}
		}

		System.out.println("result is =" + res + "count is ::::" + occuringCount);
	}

}
