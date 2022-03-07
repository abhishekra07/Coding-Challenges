
public class RunLengthDeconding {

	public static void main(String[] args) {
		String str = "4B3A2D1C2B";
		System.out.println(decode(str));
	}
	
	public static boolean isAlpha(char c) {
		if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            return true;
        else
            return false;
	}
	
	public static StringBuffer decode(String str) {
		StringBuffer output = new StringBuffer();
		String num="";
		for(int i = 0; i < str.length(); i++) {
			if(isAlpha(str.charAt(i))) {
				output.append(i * Integer.valueOf(i));
				num += i;
			} else {
				num+=i;
			}
		}
		return output;
	}

}
