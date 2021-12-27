public class Nb7_Sticks_MinimumCost {

    public static long minimumCost(int n, int[] length, int[] cost)
    {
        long min_cost=Long.MAX_VALUE;

        for (int e : length){
            long current_price = 0;

            for (int x=0; x<length.length; x++){
                int difference = Math.abs(e-length[x]);
                current_price += difference*cost[x];
            }
            min_cost = Math.min(current_price,min_cost);
        }

        return min_cost;
    }


    public static void main(String[] args) {
        int length[] = {1, 2, 3};
        int cost[] = {10, 2, 20};

        System.out.println(minimumCost(length.length,length,cost));


    }
}
