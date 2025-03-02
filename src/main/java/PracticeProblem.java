public class PracticeProblem {
	public static void main(String args[]) {}

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

	final static int MAX_VALUE = 10;
	public static boolean totalWordsChecker(String word) {

		boolean isMax = false;
		String[] wordCount = word.split("[ ,./;({<-]");

		if (wordCount.length <= MAX_VALUE) {
			isMax = true;
		}

		return isMax;
		
	}

}
