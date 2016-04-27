class canBalance {

    public static boolean canBalanceThis (int[] numbers) {
        int i = 0;
        int j = 0;
        double leftTotal = 0;
        double rightTotal = 0;
        for (i = 1; i < numbers.length; i++) {
			leftTotal = 0;
			rightTotal = 0;
            //left
            for (j = 0; j < i; j++) {
                leftTotal = leftTotal + numbers[j];
            }

            //right
            for (j = i; j < numbers.length; j++) {
                rightTotal = rightTotal + numbers[j];
            }

            System.out.println("leftTotal: " + leftTotal);
            System.out.println("rightTotal: " + rightTotal + "\n");

            if(leftTotal == rightTotal) {
            	return true;
            }

        }
        return false;//temp
    }

    public static void main (String[] args) {
    	int[] numbers = {1,1,1,2,1}; // true
    	//int[] numbers = {2,1,1,2,1}; // false
        //int[] numbers = {10,10}; // true

        System.out.println(canBalanceThis(numbers));
    }

}