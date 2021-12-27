public class Nb8_Find_X {

    public static int findX(String s)
    {

        String[] split = s.split("[+ =]");

        int xAt = 0;
        for (int x=0; x<3; x++){
            if (split[x].equals("X")){
                xAt= x;
            }
        }

        if (xAt==2){
            int p1 = Integer.parseInt(split[0]);
            int p2 = Integer.parseInt(split[1]);
            return(p1+p2);
        } else if (xAt==1){
            int p1 = Integer.parseInt(split[0]);
            int e = Integer.parseInt(split[2]);
            return(e-p1);
        } else {
            int p2 = Integer.parseInt(split[1]);
            int e = Integer.parseInt(split[2]);
            return(e-p2);
        }
    }

    public static void main(String[] args) {
        String s = "X+20=40";
        System.out.println(findX(s));
    }
}
