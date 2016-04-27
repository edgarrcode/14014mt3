class isOddMultiple {

	public static boolean isEven (int n) {
		System.out.println("n % 2 =  " + (n % 2));
		if ((n % 2) == 0) {
			System.out.println(n + " is an even number");
			System.out.println("returning true");
			return true;
		}
		System.out.println(n + " is NOT an even number");
		System.out.println("returning false");
		return false;
	}

	public static boolean isMultiple (int m, int p) {
		System.out.println("p % m =  " + (p % m));
		if ((p % m) == 0) {
			System.out.println(p + " is a multiple of " + m);
			System.out.println("returning true");
			return true;
		}
		System.out.println(p + " is NOT a multiple of " + m);
		System.out.println("returning false");
		return false;
	}

	public static boolean isOddMultiple (int n, int p) {
		System.out.println("(isMultiple(n,p)) =  " + (isMultiple(n,p)));
		System.out.println("!(isEven(n)) =  " + !(isEven(n)));

		if ( (isMultiple(n,p)) && !(isEven(n)) ) {
			System.out.println(p + " is a multiple of " + n);
			System.out.println(n + " is an odd number");
			System.out.println("returning true");
			return true;
		}

		return false;

	}

	public static void main(String[] args) {
		int n = 3;
		int p = 9;
		System.out.println(isOddMultiple(n,p));
	}
}