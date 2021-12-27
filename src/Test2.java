

public class Test2 {

    public static int[] removeFirstElement(int length[]){
        int[] finalArray = new int[length.length-1];

        for (int x = 1; x<length.length; x++){
            finalArray[x-1]=length[x];
        }

        return finalArray;
    }

    public static int[] elementToEnd(int length[]){
        int[] finalArray = new int[length.length];

        for (int x = 1; x<length.length; x++){
            finalArray[x-1]=length[x];
        }
        finalArray[length.length-1]=length[0];

        return finalArray;
    }

    public static void printArray(int arr[]){
        for (int x = 0; x<arr.length; x++){
            System.out.print(arr[x]+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int N = 4;
        int M = 3;
        int K = 2;
        int A[] = {0, 1, 0, 1};
        int B[] = {1, 1, 0};

        for (int x=0; x<K; x++){
            if (A[0]==B[0]){
                A = removeFirstElement(A);
                B = removeFirstElement(B);
            } else A = elementToEnd(A);
        }

        printArray(A);
        printArray(B);


    }
}
