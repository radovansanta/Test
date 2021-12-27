import java.lang.reflect.Array;
import java.util.Arrays;

public class Nb20_EqualPiles {

    public static int minSteps(int[] piles){
        int len = piles.length;
        if(len <= 1) return 0;
        Arrays.sort(piles);
        int res = 0, distinctNums = 0;
        for(int i = 1; i < len; ++i){
            if(piles[i] == piles[i - 1]){
                res += distinctNums;
            }
            else{
                ++distinctNums;
                res += distinctNums;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] piles = {5, 5, 2, 1};
        System.out.println(minSteps(piles));

    }
}
