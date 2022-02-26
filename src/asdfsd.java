import java.util.Scanner;
public class asdfsd
{
    public static int[][] solve(int[] A, int[] B) {
        int index = 0, inl = 0;
        int[][] arrt = new int[B.length][A.length];
        while (index < B.length)
        {
            int x = B[index];
            //reverse the array
            for (int i = 0, j = A.length - 1; i < j; i++) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j--;
            }

            for (int i = 0, j = x; i < j; i++) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j--;
            }
            for (int i = x + 1, j = A.length - 1; i < j; i++) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j--;}
            int index1 = 0;
            for (int j = 0; j < A.length; j++) {
                arrt[inl][j] = A[index1];
                index1++;
            }
            index= index+1;
            inl= inl+1;}

        return arrt;

    }
    public static void main(String[] args)
    {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the main array");
        size = sc.nextInt();
        int[] arr= new int[size];
        System.out.println("enter the elements of the main array");
        for(int i =0;i< size; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the size of second array");
        int size1 = sc.nextInt();
        int arr2[] = new int[size1];
        System.out.println("Enter the elements of the second array");
        for(int i =0; i <size1; i++)
        {
            arr2[i] = sc.nextInt();
        }
        int[][] arro = new int[size1][size1];
        arro = solve(arr, arr2);
        for(int i=0; i<size1; i++)
        {
            for(int j=0; j<size; j++)
            {
                System.out.print(arro[i][j]+" ");
            }
            System.out.println();
        }

    }

}

