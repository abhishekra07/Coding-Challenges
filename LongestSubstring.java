import java.util.Arrays;
import java.util.HashMap;

/*
 * Longest Substring Without Repeating Characters
 * Given a string s, find the length of the longest substring without repeating characters.
 * 
 * Example 1:
 * Input: s = "abcabcbb"
	Output: 3
	Explanation: The answer is "abc", with the length of 3.
	
	Example 2:

	Input: s = "bbbbb"
	Output: 1
	Explanation: The answer is "b", with the length of 1.
	
	Example 3:

	Input: s = "pwwkew"
	Output: 3
	Explanation: The answer is "wke", with the length of 3.
	Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
	
	Constraints:

	0 <= s.length <= 5 * 104
	s consists of English letters, digits, symbols and spaces.

 */
public class LongestSubstring {
		public int lengthOfLongestSubstring(String s) {
	       if (s.length()==0) return 0;
	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	        int max=0;
	        for (int i=0, j=0; i<s.length(); ++i){
	            if (map.containsKey(s.charAt(i))){
	                j = Math.max(j,map.get(s.charAt(i))+1);
	            }
	            map.put(s.charAt(i),i);
	            max = Math.max(max,i-j+1);
	        }
	        return max;
	    }
		
		public int lengthOfLongestSubstring2(String str) {
	        int n = str.length();
	        int res = 0;
	        int [] lastIndex = new int[256];
	        Arrays.fill(lastIndex, -1);
	        int i = 0;
	        // Move end of current window
	        for (int j = 0; j < n; j++) {
	            // Find the last index of str[j]
	            // Update i (starting index of current window)
	            // as maximum of current value of i and last
	            // index plus 1
	            i = Math.max(i, lastIndex[str.charAt(j)] + 1);
	 
	            // Update result if we get a larger window
	            res = Math.max(res, j - i + 1);
	 
	            // Update last index of j.
	            lastIndex[str.charAt(j)] = j;
	        }
	        return res;
	    }
}
