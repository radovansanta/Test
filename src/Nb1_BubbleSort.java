public class Nb1_BubbleSort {
    // 4 min 48 seconds

    public static int[] bubbleSort(int arr[]){
        int n = arr.length;

        for (int x = 0; x<n-1; x++){
            for (int i = 0; i<n-1-x; i++){
                if (arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void printArray(int arr[]){
        for (int x = 0; x<arr.length; x++){
            System.out.print(arr[x]+" ");
        }
    }



    public static void main(String args[])
    {
        int arr[] = {5,3,1,9,8,2,4,7};
        bubbleSort(arr);
        System.out.println("Sorted array");
        printArray(arr);
    }
}
