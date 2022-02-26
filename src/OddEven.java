import java.util.Scanner;


public class OddEven {
    public static void main(String[] args)
    {
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
        sc.close();
        int index=0;
        int oddindex=0, evenindex=0;
        while(index<size)
        {
            if(arr[index]%2!=0)
            {
                oddindex++;
                index= index+1;
            }
            if(arr[index]%2==0)
            {
                evenindex++;
                index= index+1;
            }

        }
        int[] arr_even= new int[evenindex];
        int[] arr_odd = new int[oddindex];
        int index1=0, index2=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                arr_even[index1] = arr[i];
                index1++;
            }
            if(arr[i]%2!=0)
            {
                arr_odd[index2]= arr[i];
                index2++;
            }
        }
        for(int element:arr_even)
            System.out.print(element+" ");
        System.out.println();
        for(int element1:arr_odd)
            System.out.print(element1+" ");

    }
}
