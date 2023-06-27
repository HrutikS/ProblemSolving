import java.util.Scanner;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Haystack");
        String haystack = sc.nextLine();
        System.out.println("Enter Needle");
        String needle = sc.nextLine();
        System.out.println(strStr(haystack, needle));
        sc.close();
    }

    public static int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i, needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
