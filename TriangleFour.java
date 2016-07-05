package A1;

/**
 * Created by Jayashree on 05-07-2016.
 */
public class TriangleFour {
    public static void main(String[] args) {

int i,j;
        int num=Integer.parseInt(args[0]);
        for(i=0;i<num;i++) {
            for (j = 0; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}