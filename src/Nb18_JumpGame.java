public class Nb18_JumpGame {
    public static boolean canJump(int[] arr){
        int maxGoodIndexPosition = arr.length-1;

        for (int i = arr.length-1; i>=0; i--){
            if (i + arr[i] >= maxGoodIndexPosition){
                maxGoodIndexPosition = i;
            }
        }

        return maxGoodIndexPosition==0;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,0,1,4};

        System.out.println(canJump(arr));
    }
}
