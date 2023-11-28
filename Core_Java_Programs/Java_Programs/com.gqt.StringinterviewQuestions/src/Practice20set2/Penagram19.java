//19.check whether the given string is panagram or not.
package Practice20set2;
import java.util.Scanner;
public class Penagram19 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String input = sc.next(); 
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The given string is a pangram.");
        } else {
            System.out.println("The given string is not a pangram.");
        }
    }
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabet = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }
        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }
        return true;
    }
}
	


