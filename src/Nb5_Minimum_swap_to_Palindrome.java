public class Nb5_Minimum_swap_to_Palindrome {

    static int countSwap(String s)
    {
        char[] chars = s.toCharArray();
        int count = 0;

        int n = chars.length;


        for (int i = 0; i < n / 2; i++) {
            int left = i;
            int right = n - left - 1;

            while (left < right) {
                if (chars[left] == chars[right]) {
                    break;
                }
                else {
                    right--;
                }
            }

            if (left == right) {
                return -1;
            }

            for (int j = right; j < n - left - 1; j++) {
                char temp = chars[j];
                chars[j] = chars[j + 1];
                chars[j + 1] = temp;
                count++;
            }


        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSwap("geeksfgeeks"));
    }
}
