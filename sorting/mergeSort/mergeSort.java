import java.util.Scanner;

public class mergeSort {
    public static void mergesort(int p,int q,int [] arr)
    {
        if(p<q)
        {
            int k=(p+q)/2;
            mergesort(p,k,arr);
            mergesort(k+1,q,arr);
            merge(arr,p,k,q);

        }
    }
    public static void merge(int [] arr,int p,int k,int q)
    {
        int n1=k-p+2;
        int n2=q-k+1;
        int []l1=new int [n1];
        int []l2=new int [n2];
        l1[n1-1]=Integer.MAX_VALUE;
        l2[n2-1]=Integer.MAX_VALUE;
        for(int i=0;i<n1-1;i++)
        {
            l1[i]=arr[i+p];
        }
        for(int i=0;i<n2-1;i++)
        {
            l2[i]=arr[i+k+1];
        }
        int i=0,j=0;
        for(int b=p;b<=q;b++)
        {
            if(l1[i]<=l2[j])
            {
                arr[b]=l1[i];
                i++;
            }
            else
            {
                arr[b]=l2[j];
                j++;
            }
        }
    }



    public static void main(String [] args)
    {
        int n;
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        int []arr = new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextInt();
        }
        mergesort(0,n-1,arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
