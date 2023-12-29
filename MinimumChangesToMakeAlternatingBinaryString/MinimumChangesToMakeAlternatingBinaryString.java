class Solution {
    public int minOperations(String s) {
        int startWithZero = 0; //010101...
        for(int i=0; i<s.length(); i++){
            if(i%2==0){  //Even
                if(s.charAt(i)=='1'){
                    startWithZero++;
                }
            }else{  //Odd
                if(s.charAt(i)=='0'){
                    startWithZero++;
                }
            }
        }
        int startWithOne = (s.length()-startWithZero);
        return Math.min(startWithOne, startWithZero);
    }
}
