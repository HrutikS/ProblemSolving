import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits){
        List<String> ans = new ArrayList<String>();
        if(digits.length() == 0){
            return ans;
        }
        StringBuilder output = new StringBuilder();
        int index=0;
        String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits,output,index,ans,map);
        return ans; 
    }

    public static void solve(String digits, StringBuilder output, int index, List<String> ans, String[] map){
        //base_case
        if(index >= digits.length()){
            ans.add(output.toString());
            return;
        }
        //For getting the characters at the digits
        int number = digits.charAt(index) - '0'; //Doing -'0' to convert the character to int
        String value = map[number];

        //Traversing the characters of the digits
        for (int i = 0; i < value.length(); i++) {
            output.append(value.charAt(i));  
            solve(digits,output,index+1,ans,map);
            output.deleteCharAt(output.length()-1);
        }

    }
}
