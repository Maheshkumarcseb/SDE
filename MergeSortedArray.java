//  brute force method
public class MergeSortedArray{
    public static void MergeArray(int[] arr1, int[] arr2)
    { 
        int n=arr1.length;
        int m=arr2.length;
        int[] arr3 = new int[n + m];
        int left = 0;
        int right = 0;
        int index = 0;

        // Insert the elements from the 2 arrays
        // into the 3rd array using left and right
        // pointers:

        while (left < n && right < m) {
            if (arr1[left] <= arr2[right]) {
                arr3[index] = arr1[left];
                left++;
                index++;
            } else {
                arr3[index] = arr2[right];
                right++;
                index++;
            }
        }

        // If right pointer reaches the end:
        while (left < n) {
            arr3[index++] = arr1[left++];
        }

        // If left pointer reaches the end:
        while (right < m) {
            arr3[index++] = arr2[right++];
        }

        System.out.println("sorted array is");
        for(int i=0;i<m+n;i++)
        {
            System.out.print(arr3[i]+" ");
        }

  
    }
    public static void main(String[] args) {
        int[] arr1={3,5,7,12,61};
        int [] arr2={1,5,9,15};
        MergeArray(arr1,arr2);


    }
}