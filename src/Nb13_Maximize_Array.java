import java.util.ArrayList;

public class Nb13_Maximize_Array {

    public static int[] maximizeArray(int N, int[]A1, int[]A2){
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();

        for (int x = 0; x<N; x++){
            arrayList1.add(A1[x]);
        }

        for (int x = 0; x<N; x++){
            arrayList2.add(A2[x]);
        }

        for(int x = 0; x<arrayList1.size(); x++){
            int max_second=0;
            for(int y = 0; y<arrayList2.size(); y++){
                max_second = Math.max(max_second,arrayList2.get(y));
            }
            if (max_second>arrayList1.get(x)){
                arrayList1.remove(x);
                arrayList1.add(x,max_second);
                arrayList2.remove(arrayList2.indexOf(max_second));
            }
        }



        return arrayToArr(arrayList1);
    }

    public static int[] arrayToArr(ArrayList<Integer> arrayList){
        int[] finalArr = new int[arrayList.size()];

        for (int x = 0; x<arrayList.size();x++){
            finalArr[x]=arrayList.get(x);
        }
        return finalArr;
    }

    public static void printArray(int arr[]){
        for (int x = 0; x<arr.length; x++){
            System.out.print(arr[x]+" ");
        }
    }


    public static void main(String[] args) {
        int N = 5;
        int A1[] = {5, 2, 3, 6, 7};
        int A2[] = {9, 2, 8, 4, 5};

        //9 8 5 6 7
        printArray(maximizeArray(A1.length,A1,A2));
    }
}
