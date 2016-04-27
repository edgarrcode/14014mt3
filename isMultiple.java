class isMultiple {
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

	public static void main(String[] args) {
		int m = 121;
		int p = 10;
		System.out.println(isMultiple(m,p));
	}
}