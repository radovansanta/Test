import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Nb3_Longest_Consecutive_Subsequence {
    //6 min 15 sec

    public static int longestSubsequence(int n, int[] arr){
        int max = 0;

        Set<Integer> numbers = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toSet());

        numbers.stream().sorted();

        for (int number : numbers){
            if (!numbers.contains(number-1)){
                int len = 1;
                while (numbers.contains(number+len)){
                    len++;
                }

                max = Math.max(max, len);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int n = 7;
        int arr[ ] = {1, 9, 3, 10, 4, 20, 2};

        System.out.println(longestSubsequence(n,arr));
    }
}
