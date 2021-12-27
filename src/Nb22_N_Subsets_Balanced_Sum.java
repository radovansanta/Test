import java.util.*;

public class Nb22_N_Subsets_Balanced_Sum {

    /*
    public static int[][] result(int [] nums, int n){
        int sum = Arrays.stream(nums).sum();
        int target = sum / n;
        int[][] result = new int[3][];

        ArrayList<Integer> used = new ArrayList<Integer>();

        if (sum%n>0){
            System.out.println("Not possible");
        }else {
            for (int x = 0; x < nums.length; x++) {
                if (nums[x]==target){
                    System.out.println(nums[x]);
                } else if (nums[x]>target){
                    System.out.println("Not possible");
                }
                if (!used.contains(nums[x])) {
                    for (int y = x + 1; y < nums.length; y++) {
                        if (nums[x] + nums[y] == target) {
                            System.out.println(nums[x] + " " + nums[y]);
                            used.add(nums[x]);
                            used.add(nums[y]);
                        }
                    }
                }
            }
        }


    }



    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2};
        int sum = Arrays.stream(nums).sum();
        int target = sum / 2;

        ArrayList<Integer> used = new ArrayList<Integer>();

        if (sum%2>0){
            System.out.println("Not possible");
        }else {
            for (int x = 0; x < nums.length; x++) {
                if (nums[x]==target){
                    System.out.println(nums[x]);
                } else if (nums[x]>target){
                    System.out.println("Not possible");
                }
                if (!used.contains(nums[x])) {
                    for (int y = x + 1; y < nums.length; y++) {
                        if (nums[x] + nums[y] == target) {
                            System.out.println(nums[x] + " " + nums[y]);
                            used.add(nums[x]);
                            used.add(nums[y]);
                        }
                    }
                }
            }
        }
    }
     */


    public static List<List<Integer>> part(int[] T, int n) {
        int[] sums = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return sums[a.intValue()] - sums[b.intValue()];
            }
        });
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(new ArrayList<>());
            pq.add(i);
        }

        for (int i = T.length - 1; i >= 0; i--) {
            int c = pq.poll();
            result.get(c).add(T[i]);
            sums[c] += T[i];
            pq.add(c);
        }

        return result;
    }


    public static void main(String[] args) {
        List<List<Integer>> result = part(new int[] {1, 2, 3, 4, 2,20}, 2);
        System.out.println(result);
    }
}
