public class PracticeProblem {
	public static void main(String args[]) {
		System.out.println(totalWordsChecker("Hello() b c d e f g h i j"));
	}

	public static int calculate(int num1, int num2, char op) {

		int result = 0;

		switch (op) {
			case '+':
				result = num1+num2;
				break;
			case '-':
				result = num1-num2;
				break;
			case '*':
				result = num1*num2;
				break;
			case '/':
				result = num1/num2;
				break;
			case '%':
				result = num1%num2;
				break;
			case '^':
				result = (int)Math.pow(num1, num2);
				break;
		}

		return result;

	}

	final static int MAXIMUM = 10;
	public static boolean totalWordsChecker(String word) {

		boolean isMax = false;
		String[] eachWord = word.split("[^a-zA-Z_']");
		
		int count=0;
		for (int i=0; i<eachWord.length; i++) {
				if (eachWord[i].length()>0) {
				count ++;
				}
			System.out.println(eachWord[i]);
			System.out.println(eachWord[i].length());
			System.out.println(count);
		}

		if (count <= MAXIMUM) {
			isMax = true;
		}


		return isMax;
		
	}

	public static String minString(String word1, String word2, String word3) {

		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		word3 = word3.toLowerCase();

		String earliest = "sleigh queen";

		if (word1.compareTo(word2)<0) { //word1 earlier than word2
			if (word1.compareTo(word3)<0) { //word1 earlier than word3
				earliest = word1;
			}
			else if (word1.compareTo(word3)>0) { //word1 later to word3
				earliest = word3;
			}
			else {
				earliest = word1; //word1 is same as word3
			}
		}

		else if (word1.compareTo(word2)>0) { //word1 later than word2
			if (word2.compareTo(word3)<0) { //word2 earlier than word3
				earliest = word2;
			}
			else if (word2.compareTo(word3)>0) { //word2 later to word3
				earliest = word3;
			}
			else {
				earliest = word2; //word2 is same as word3
			}
		}

		else {
			earliest = word1; //word1 is same as word2
		}

		return earliest;

	}

}