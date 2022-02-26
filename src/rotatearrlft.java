import java.util.Arrays;
import java.util.Scanner;

public class rotatearrlft {
    public static int[] rleft( int A[], int k)
    {
        int [] A1= new int[A.length];
        System.out.println(Arrays.toString(A));
        for(int i=0; i<A.length; i++)
        {
            if((i-k)>=0)
            {
             A1[i-k]=A[i];
            }
            else
                if((i-k)<0)
                {
                    A1[i-k+A.length]= A[i];
                }
        }
        System.out.println(Arrays.toString(A1));
        return A1;
    }

    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        size = sc.nextInt();
        int[] arr= new int[size];
        System.out.println("enter the elements of the array");
        for(int i=0; i<arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        int Arr[] = new int[size];
        System.out.println("enter the number of rotations");
        int k = sc.nextInt();
        Arr= rleft(arr, k);
        System.out.println(Arrays.toString(Arr));
    }
}
