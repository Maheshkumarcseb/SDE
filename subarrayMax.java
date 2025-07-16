public class subarrayMax{
    public static void main(String[] args) {
        int arr[]={1,2,3,1,4,5,2,3,6};
        int k=3;
        int n = arr.length;
        int res[]= new int[n-k+1];
        res=subarray(arr,k);
        System.out.println("k-subarray maximum element is:");
        for(int ele:res)
        {
            System.out.print(ele+" ");
        }
    }
    public static int[] subarray(int[] arr, int k)
    {
        int n = arr.length;
        int res[]=new int[n-k+1];
        int max=0,count=0;
        for(int i=0;i<arr.length-k +1;i++)
        {
            for(int j=i;j<k+i;j++)
            {
                if(arr[j] > max)
                    max = arr[j];
            }
            res[count]=max;
            count++;
        }
        return res;

    }
}


/* 
using deque array

import java.util.*;

class Solution {
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();  // Stores indices

        for (int i = 0; i < arr.length; i++) {
            // Remove elements outside the current window
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove all elements smaller than current from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // Add current index at the back of the deque
            dq.offerLast(i);

            // If window has at least k elements, add the max to result
            if (i >= k - 1) {
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k1 = 3;
        System.out.println("Output for Example 1: " + Solution.maxOfSubarrays(arr1, k1));

        // Example 2
        int[] arr2 = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
        int k2 = 4;
        System.out.println("Output for Example 2: " + Solution.maxOfSubarrays(arr2, k2));

        // Example 3
        int[] arr3 = {5, 1, 3, 4, 2, 6};
        int k3 = 1;
        System.out.println("Output for Example 3: " + Solution.maxOfSubarrays(arr3, k3));
    }
}

*/