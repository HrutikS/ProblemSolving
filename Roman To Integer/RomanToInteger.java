import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class RomanToInteger{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman Numeral");
        String s = sc.nextLine();
        //String s = "MCMXCIV";
        System.out.println(romanToInteger(s));
        sc.close();
    }
    public static int romanToInteger(String s){
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int ans = map.get(s.charAt(s.length()-1));

        for (int i = s.length()-2; i >= 0 ; i--) {
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                ans -= map.get(s.charAt(i));
            }else{
                ans += map.get(s.charAt(i));
            }
        }
        return ans;
    }
}
