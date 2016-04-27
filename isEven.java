class isEven {
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

	public static void main(String[] args) {
		int n = 121;
		System.out.println(isEven(n));
	}
}