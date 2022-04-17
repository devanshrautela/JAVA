import java.io.InputStream;
import java.util.*;

public class jagged {
    public static void main(String[] args)
    {
        int arr1[][] = new int[3][];
        arr1[0]=new int[3];
        arr1[1]=new int[4];
        arr1[2]=new int[2];
        Scanner sc = new Scanner(System.in);
        //input
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1[i].length; j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        //display
        for(int i=0; i<arr1.length; i++)
        {
            for(int j=0; j<arr1[i].length; j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
                System.out.println("");
        }
    }
}