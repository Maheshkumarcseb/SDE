/*          write a c program that accept an integer n as the input . 
the program must print the smallest integer x such that the product
 of all the digit in x is equal to n if it is not possible to form 
 the integer x the print -1 as output    */
 
#include <stdio.h>

// Function to find the smallest integer x
int findSmallest(int n) {
    // If n is 0 or 1, the smallest integer is n itself
    if (n == 0) return 10; // Smallest number with product 0 is 10 (1 * 0 = 0)
    if (n == 1) return 1;

    int digits[10]; // Array to store digits of the number
    int index = 0;

    // Factorize the number using digits 9 to 2
    for (int i = 9; i >= 2; i--) {
        while (n % i == 0) {
            digits[index++] = i;
            n /= i;
        }
    }

    // If n is not 1, it means it contains a prime factor > 9
    if (n != 1) return -1;

    // Construct the smallest number using the collected digits
    int result = 0;
    for (int i = index - 1; i >= 0; i--) {
        result = result * 10 + digits[i];
    }

    return result;
}

int main() {
    int n;
    printf("Enter an integer n: ");
    scanf("%d", &n);

    int result = findSmallest(n);

    printf("The smallest integer x is: %d\n", result);

    return 0;
}
