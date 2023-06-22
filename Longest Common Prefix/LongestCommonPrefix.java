import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array of Strings");
        //Setting s.length()=3 for easier and quick inputs
        String[] s = new String[3];
        for (int i = 0; i < s.length; i++) {
            s[i]=sc.nextLine();
        }
        System.out.println(longestCommonPrefix(s));
        sc.close();
        
    }
    
    public static String longestCommonPrefix(String[] s){

        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length-1];
        int i=0;
        while(i<=s1.length()-1) {
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
            }else{
                break;
            }
        }

        //return (if i=0 then "" else s1.substring(0,i))
        return i==0?"":s1.substring(0, i);
    }
}
