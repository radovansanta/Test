import java.util.ArrayList;

public class Nb9_Find_Word {
    public static ArrayList<String> findWords(String A, String B)
    {
        String[] split = B.split(" ");
        ArrayList<String> words = new ArrayList<String>();

        for (int x = 0; x<split.length; x++){
            if (split[x].length()>=A.length()){
                int temp = 0;
                for (int y = 0; y<A.length(); y++){
                    if (split[x].charAt(y) == A.charAt(y)){
                        temp++;
                    }
                }
                if (temp==A.length()){
                    words.add(split[x]);
                }
            }
        }

        return words;
    }

    public static void main(String[] args) {
        String A = "san";
        String B = "sandy hook has lot of sand";

        System.out.println(findWords(A,B));
    }
}
