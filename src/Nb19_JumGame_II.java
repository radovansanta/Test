import java.util.LinkedList;
import java.util.Queue;

public class Nb19_JumGame_II {

    public static boolean canJump(int[] arr, int start){
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);

        while (qu.size()>0){
            int size = qu.size();
            while (size-- > 0){
                int point = qu.remove();

                //Either move to left point -arr[point]
                if (point - arr[point] >=0){
                    if (arr[point-arr[point]]==0){
                        return true;
                    }
                    else if (arr[point-arr[point]] > 0){
                        qu.add(point-arr[point]);
                    }
                }

                //Either move to right point +arr[point]
                if (point + arr[point] < arr.length){
                    if (arr[point+arr[point]]==0){
                        return true;
                    }
                    else if (arr[point+arr[point]] > 0){
                        qu.add(point+arr[point]);
                    }
                }

                arr[point]=-1;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] arr = {4,2,3,0,3,1,2};

        System.out.println(canJump(arr,5));
    }
}
