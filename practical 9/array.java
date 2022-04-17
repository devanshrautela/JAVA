import java.io.InputStream;
import java.util.*;

public class array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][3]; //input
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //display
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        //search
        int key = sc.nextInt();
        int f=0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                if(arr[i][j]==key)
                {
                    System.out.println(key+" is present");
                    f=1;
                    break;
                }
            }

        }
        if(f==0)
        {
            System.out.println(key+" not found");
        }
    }
}
