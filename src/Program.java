import java.awt.*;
import java.util.Random;

public class Program {
    public static void main(String[]args){

        final int q=5;
        int [] [] a = new int[q][q];
        Random rnd = new Random();
        for (int i = 0;i<q;i++){
            for (int j =0;j<q;j++){
                a[i][j] = rnd.nextInt(20)+1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Result:");
        int []b = new int[21];
        int count;
        for (int i = 0;i<q;i++)
        {
            count=0;
            for (int k=0;k<21;k++)
                b[k]=0;
            for (int j=0;j<q;j++)
            {
                if (b[a[i][j]]==0)
                {
                    System.out.print(a[i][j]+" ");
                }
                else if (b[a[i][j]]==1)
                {
                    count+=2;

                }
                else
                {
                    count++;
                }
                b[a[i][j]]++;
            }
            System.out.println("Count:"+count);


        }
        System.out.println("Result2: ");
        int [] c = new int[21];
        boolean t;
        for (int i = 0;i<q;i++)
        {   t= false;
            for (int k=0;k<21;k++)
                b[k]=0;
            for (int j=0;j<q;j++)
            {
                if (b[a[i][j]]!=0)
                {
                    if (c[b[a[i][j]]]==0)
                    {   t=true;
                        System.out.print(a[i][j]+" ");
                    }
                    c[b[a[i][j]]]++;
                }

              b[a[i][j]]++;
            }
            if (t) System.out.println();



        }



    }
}