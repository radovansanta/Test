public class Nb4_Kadane_Algorithm {
    //7 min + small Hint

    public static int kadaneAlgorithm(int n, int arr[]){
        int curr_max = arr[0];
        int max_so_far = arr[0];

        for (int x=1; x<n; x++){
            curr_max = Math.max(arr[x], curr_max + arr[x]);
            max_so_far = Math.max(curr_max,max_so_far);
        }

        return max_so_far;
    }


    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1, 2, 3, -2, 5};

        System.out.println(kadaneAlgorithm(n,arr));
    }
}
