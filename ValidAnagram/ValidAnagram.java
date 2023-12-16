class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        
        //First approach
        // char[] sArray = s.toCharArray();
        // Arrays.sort(sArray);
        // String sSorted = new String(sArray);

        // char[] tArray = t.toCharArray();
        // Arrays.sort(tArray);

        // if(Arrays.equals(sArray, tArray)){
        //     return true;
        // }else{
        //     return false;
        // }

        //Optimized
        int[] char_counts = new int[26];
        for(int i=0; i<s.length(); i++){
            char_counts[s.charAt(i)-'a']++;
            char_counts[t.charAt(i)-'a']--;
        }

        for(int count : char_counts){
            if(count != 0){
                return false;
            }
        }

        return true;
    }
}
