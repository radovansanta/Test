public class Nb6_IsPalindrome {

    public static boolean isPalindrome(String s){
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n / 2; i++) {
            int left = i;
            int right = n - left - 1;

            if (left!=right){
                if (chars[left]!=chars[right]){
                    return false;
                }
            }

        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }
}
