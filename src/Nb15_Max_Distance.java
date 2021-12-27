public class Nb15_Max_Distance {

    public static void main(String[] args) {
        int points[][] = {{1, 2}, {3, -1}, {-6, 3}};
        double max_distance = 0;

        for (int x = 0; x<points.length; x++){
            for (int y = x+1; y<points.length; y++){
                double current_distance = Math.sqrt(
                        ((points[x][1]-points[x][0])*(points[x][1]-points[x][0]))+((points[y][1]-points[y][0])*(points[y][1]-points[y][0]))
                );
                System.out.println(current_distance);
                max_distance = Math.max(max_distance,current_distance);
            }
        }

        System.out.println(Math.round(max_distance * 100.0) / 100.0);
    }
}
