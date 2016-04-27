class stringClean {

    public static String cleanThisString (String str) {
    	String cleanStr = "";
        int index = 0;
        //base
        if (str.length() == 1) {
        	return str;
        }
        if (str.charAt(index) != str.charAt(index + 1)) {
        	cleanStr = "" + str.charAt(index);
        }
    	index++;

        return cleanStr + cleanThisString(str.substring(index));
    }

    public static void main (String[] args) {
    	System.out.println(cleanThisString("abbbccd"));
    }

}