import java.util.ArrayList;

public class Nb17_Largest_K_Minus_K {

    public static int LargestK_minusK(int[] array) {
        int[] sortedArray = new int[array.length];

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int x = 0; x<array.length; x++){
            arrayList.add(array[x]);
        }

        for (int y = 0; y<arrayList.stream().sorted().toArray().length; y++){
            sortedArray[y]= (int) arrayList.stream().sorted().toArray()[y];
        }


        for (int z = 1; z<=sortedArray.length;z++){
            if (arrayList.contains(-sortedArray[sortedArray.length-z])){
                return sortedArray[sortedArray.length-z];
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        int[] array = {3, 2, -2, 5, -3};

        System.out.println(LargestK_minusK(array));
    }
}
