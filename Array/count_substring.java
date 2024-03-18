import java.util.HashMap;
import java.util.Map;

public class Solution {
    public long countSubstrings(String s, char c) {
        int[] freq = new int[26]; 
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++; 
        }
        
        long ans = 0; 
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                ans += freq[ch - 'a']; 
            }
            
            freq[ch - 'a']--;
        }       
        return ans;
    }
}
