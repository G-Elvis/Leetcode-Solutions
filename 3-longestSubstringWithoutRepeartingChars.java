import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet <>();
        int k =0;
        int max = 0;
        for (int i=0; i<s.length(); i++){
            while (seen.contains(s.charAt(i))){
                seen.remove(s.charAt(k));  
                k++;             
            }
            seen.add(s.charAt(i));
            max = Math.max(max, i-k+1);
         
        }
    return max;
    }
    //Test Case
    public void main(String[] args) {
        String s = "abcabc";
        String s2 = "pwabwkew";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstring(s2));
    }
}