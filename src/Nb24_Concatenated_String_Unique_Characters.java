import java.util.ArrayList;
import java.util.List;

public class Nb24_Concatenated_String_Unique_Characters {

    public static boolean isCharactersUnique(String string){
        for (int x = 0; x<string.length(); x++){
            for (int y=x+1; y<string.length(); y++){
                if (string.charAt(x)==string.charAt(y)){
                    return false;
                }
            }
        }
        return true;
    }

    // Function to generate all possible
    //  strings from the given array
    public static ArrayList<String> helper(List<String> arr,
                                    int ind)
    {
        ArrayList<String> fin = new ArrayList<>();
        fin.add("");

        // Base case
        if (ind == arr.size() )
            return fin;

        // Consider every string as
        // a starting substring and
        // store the generated string
        ArrayList<String> tmp = helper(arr, ind + 1);

        ArrayList<String> ret = new ArrayList<>(tmp);

        // Add current string to result of
        // other strings and check if
        // characters are unique or not
        for(int i = 0; i < tmp.size(); i++)
        {
            String test = tmp.get(i) +
                    arr.get(ind);

            if (isCharactersUnique(test)){
                ret.add(test);
            }
        }
        return ret;
    }

    public static int maxLength(List<String> arr)
    {
        ArrayList<String> tmp = helper(arr, 0);

        int len = 0;

        // Return max length possible
        for(int i = 0; i < tmp.size(); i++)
        {
            len = Math.max(len, tmp.get(i).length());
        }

        // Return the answer
        return len;
    }


    public static void main(String[] args) {
        List<String> test = new ArrayList<>();

        test.add("cha");
        test.add("r");
        test.add("act");
        test.add("ers");


        System.out.println(maxLength(test));
    }
}
