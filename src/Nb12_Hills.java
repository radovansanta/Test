import java.util.ArrayList;
import java.util.HashMap;

public class Nb12_Hills {

    public static void main(String[] args) {
        int N = 4;
        int A1[] = {1, 2, 3};
        int A2[] = {3, 2, 1};

        HashMap<Integer, ArrayList<Integer>> houseHill = new HashMap<Integer,ArrayList<Integer>>();
        //In HashMap are stored houses e.g. House 1 has ArrayList [1,3]
        for (int x = 0; x<N-1; x++){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(A1[x]);
            temp.add(A2[x]);
            houseHill.put(x+1,temp);
        }

        int result=0;

        for (int x = 1; x<N; x++){
            for (int y = x+1; y<=N; y++){
                ArrayList<Integer> houses = new ArrayList<>();
                for (int z = x; z<y; z++){
                    houses.add(z);
                }
                int highestA1 = Integer.MIN_VALUE;
                int smallestA2 = Integer.MAX_VALUE;

                for (int e:houses){
                    highestA1 = Math.max(houseHill.get(e).get(0),highestA1);
                    smallestA2 = Math.min(houseHill.get(e).get(1),smallestA2);
                }

                if (highestA1==smallestA2){
                    result++;
                }


            }
        }

        System.out.println(result);


    }
}
