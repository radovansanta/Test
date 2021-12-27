import java.util.Arrays;
import java.util.LinkedList;

public class Nb14_OverlappedInterval {
    public static int[][] overlappedInterval(int[][] intervals) {
        //Sort intervals starting with the smallest
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        printArray(intervals);
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void printArray(int arr[][]){
        for (int x = 0; x<arr.length; x++){
            for (int y = 0; y<arr[x].length; y++){
                System.out.print(arr[x][y]+" ");
            }
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,4},{6,8},{9,10}};

        //System.out.println(overlappedInterval(intervals).length);
        printArray(overlappedInterval(intervals));
    }
}
