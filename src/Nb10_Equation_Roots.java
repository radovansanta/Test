import java.util.ArrayList;
import java.util.List;

public class Nb10_Equation_Roots {

    public static List<Integer> equationRoots(int a, int b, int c)
    {
        List<Integer> result = new ArrayList<>();

        if (a==0) {
            result.add(0);
            return result;
        }else{
            double sqrt = Math.sqrt((b * b) - 4 * a * c);
            int x1 = (int) Math.floor((-b+ sqrt)/(2*a));
            int x2 = (int) Math.floor((-b- sqrt)/(2*a));

            System.out.println(x1);
            System.out.println(x2);


            if (x1<0 || x2<0){
                result.add(-1);
                return result;
            }

            result.add((int) x1);
            result.add((int) x2);
            return result;
        }
    }

    public static void main(String[] args) {
        int a = 1, b = 4, c = 8;

        equationRoots(a,b,c);



    }
}
