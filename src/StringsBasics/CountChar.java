package StringsBasics;
import java.util.Scanner;
public class CountChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String ans=countCharacter(str);
        System.out.println(ans);
    }

    private static String countCharacter(String str) {
            int[] count =new int[26];
        for (int i = 0; i <str.length() ; i++) {
            char x=str.charAt(i);
            int index=x-'a';
            count[index]+=1;
        }

    }

}
