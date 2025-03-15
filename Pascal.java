// import java.util.Scanner;

// public class Pascal {
//     // Factorial function with correct base case
//     public static int factt(int n) {
//         if (n == 0 || n == 1) 
//             return 1;
//         else 
//             return n * factt(n - 1);
//     }

//     // Function to calculate Pascal's Triangle value using correct formula
//     public static int facttor(int r, int c) {
//         if (c > r || r < 0 || c < 0) {
//             System.out.println("Invalid input. Column should be ≤ row and non-negative.");
//             return -1; // Indicating an error
//         }
//         return factt(r) / (factt(c) * factt(r - c));
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows (r): ");
//         int r = sc.nextInt();
//         System.out.print("Enter the column index (c): ");
//         int c = sc.nextInt();
        
//         int result = facttor(r, c);
//         if (result != -1) {
//             System.out.println("The value at position (" + r + ", " + c + ") in Pascal's Triangle is: " + result);
//         }
        
//         sc.close();
//     }
// }

// import java.util.Scanner;

// public class Pascal{

// static int fact(int n)
// {
//     if(n==0||n==1)
//         return 1;
//     else
//         return n*fact(n-1);
// }

// static void generateRows(int rows)
// {
//         for(int i=1;i<=rows;i++)
//         {
//             int ele=fact(rows-1)/(fact(i-1)*fact(rows-i));
//             System.out.print(ele+" ");
//         }
// }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter the number of rows");
//         int r=sc.nextInt();
//         generateRows(r);

//     }
// }


import java.util.Scanner;
public class Pascal{
    static int fact(int n)
    {
        if(n==0||n==1)
        return 1;
        else
            return n*fact(n-1);
    }
    static void generateTriangel(int rows)
    {
        for(int i=1;i<=rows;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int cal=fact(i-1)/(fact(j-1)*fact(i-j));
                System.out.print(cal+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int r=sc.nextInt();
        generateTriangel(r);
    }
}