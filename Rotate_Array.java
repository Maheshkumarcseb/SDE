public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k=3;
        int n = arr.length;
        // k=k%n;
    
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        System.out.println("rotated element are:");
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
    static void reverse(int arr[], int low, int high)
    {
        while(low < high)
        {
            int temp = arr[low];
            arr[low]= arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}



/* 


public class Rotate_Array{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7};
        int k=3;
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than n
        for(int i=0;i<k;i++)
        {
            rotate(arr, n);
        }
    }
    static void rotate(int arr[], int n)
    {
        int temp = arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println("rotated element are:");
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
}

*/
