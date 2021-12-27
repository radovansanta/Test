public class Nb2_Search_Element_Sorted_Rotated_Array {
    // 3 min 59 seconds

    public static int findElement(int n, int element, int a[]){
        for (int x=0; x<n; x++){
            if (a[x]==element){
                return x;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 9;
        int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int k = 10;

        System.out.println(findElement(n,k,a));
    }
}
