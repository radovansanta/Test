import java.util.Arrays;

public class Nb21_Integers_Sum_Zero {

    public static int[] sumZero(int n) {
        int index = 0;
        int[] arr = new int[n];
        
        for (int i = 1; i<=n/2; i++){
            arr[index]=i;
            arr[index+1]=-i;
            index+=2;
        }

        Arrays.sort(arr);
        return arr;
    }

    public static void printArray(int[] arr){
        for (int x = 0; x<arr.length; x++){
            System.out.println(arr[x]+" ");
        }
    }


    public static void main(String[] args) {
        printArray(sumZero(100000));
    }
}
