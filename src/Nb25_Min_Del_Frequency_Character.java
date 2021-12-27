import java.util.*;

public class Nb25_Min_Del_Frequency_Character {

    public static void printArray(int arr[]){
        for (int x = 0; x<arr.length; x++){
            System.out.print(arr[x]+" ");
        }
    }

    public static void printStringArray(String arr[]){
        for (int x = 0; x<arr.length; x++){
            System.out.print(arr[x]+" ");
        }
    }


    public static void main(String[] args) {

        String s = "aaabbbcc";


        HashMap<String, Integer> charFreq = new HashMap<String, Integer>();

        char[] chars = s.toCharArray();

        for (int x = 0; x<chars.length; x++){
            if (!charFreq.containsKey(String.valueOf(chars[x]))){
                charFreq.put(String.valueOf(chars[x]),1);
            } else {
                charFreq.replace(String.valueOf(chars[x]),
                        charFreq.get(String.valueOf(chars[x])),
                        charFreq.get(String.valueOf(chars[x]))+1);
            }
        }

        PriorityQueue<Integer> pq =
                new PriorityQueue<>((x, y) ->
                        Integer.compare(y, x));


        for (Map.Entry<String,Integer> it : charFreq.entrySet())
        {
            pq.add(it.getValue());
        }

        int cntChar=0;

        while (!pq.isEmpty()) {
            int frequent = pq.peek();
            pq.remove();

            if (pq.isEmpty()) {
                break;
            }

            if (frequent == pq.peek()) {
                // If frequency of the topmost
                // element is greater than 1
                if (frequent > 1) {
                    // Insert the decremented
                    // value of frequent
                    pq.add(frequent - 1);
                }

                // Update cntChar
                cntChar++;
            }
        }

        System.out.println(cntChar);


    }
}
