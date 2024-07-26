//680. Valid Palindrome II
public class validPalindrom {
    //This code only check is it a palindrom or not.
    //Now I need to solve the main problem how can I remove a word to make a Palindrom
    public static boolean validPalindromeCheck(String s) {
        int n = s.length();
        if(n == 0 || n == 1) return true;
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) != s.charAt(n-1-i)) return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(validPalindromeCheck(s));
    }
}
