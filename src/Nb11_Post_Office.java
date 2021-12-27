import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Nb11_Post_Office {
    public static ArrayList<Boolean> postOffices(int N, int Q, int X, int a[], int Queries[][])
    {
        ArrayList<Boolean> ans = new ArrayList<Boolean>();

        int B[] = new int[N];
        for(int i=0;i<N;i++)
            B[i]= a[i];
        Arrays.sort(a);
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        int temp[] = new int[N];
        temp[0]=0;
        for(int i = 1; i < N; i++){
            if(a[i] - a[i - 1] <= X){
                temp[i] = temp[i - 1];
            }
            else{
                temp[i] = temp[i - 1] + 1;
            }
        }
        for(int i = 0; i < N; i++){
            mp.put(a[i],i);
        }

        for(int i = 0; i < Q; i++){
            if(temp[mp.get(B[Queries[i][0] - 1])] == temp[mp.get(B[Queries[i][1] - 1])]){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }

    public static void printArray(int arr[]){
        for (int x = 0; x<arr.length; x++){
            System.out.print(arr[x]+" ");
        }
    }

    public static void main(String[] args) {
        int N = 3;
        int Q = 2;
        int X = 2;
        int a[] = {2, 3, 5};
        int Queries[][] = {{1, 2},{1, 3}};

        System.out.println(postOffices(N,Q,X,a,Queries));


    }
}
