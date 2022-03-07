
public class SlidingWindowAlgo {

	public static void main(String[] args) {
		String textStr = "Cab is a good Cab";
		String pattern = "Cab";
		int TL = textStr.length();
		int PL = pattern.length();
		int count = 0;
		for(int l=0, r=PL-1;l<=TL-PL;l++,r++) {
			if(match(textStr,pattern,l,r)) {
				count++;
			}
		}
		System.out.println("Count - " + count);
	}

	private static boolean match(String textStr, String pattern, int l, int r) {
		for(int i=0;i<pattern.length();i++) {
			if(textStr.charAt(l+i) != pattern.charAt(i))
				return false;
		}
		return true;
	}

}
