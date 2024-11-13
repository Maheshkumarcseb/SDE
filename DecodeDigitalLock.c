#include <stdio.h>

int main() {
    int X, sum = 0, rem, i, add = 0, originalX, numDigits = 0;
    printf("Enter the value of X: ");
    scanf("%d", &X);

    originalX = X;

    // Count the number of digits in X
    while (X != 0) {
        X /= 10;
        numDigits++;
    }

    X = originalX; // Restore the original value of X

    // Check if X is an Armstrong number (calculate sum of digits raised to the power of numDigits)
    while (X != 0) {
        rem = X % 10;

        // Calculate rem^numDigits manually
        int power = 1;
        for (i = 0; i < numDigits; i++) {
            power *= rem;
        }

        sum += power;
        X /= 10;
    }

    X = originalX; // Restore the original value of X again

    // If X is an Armstrong number, sum even digits
    if (sum == originalX) {
        while (X != 0) {
            rem = X % 10;
            if (rem % 2 == 0) {
                add += rem;
            }
            X /= 10;
        }
    } else {
        // If X is not an Armstrong number, sum odd digits
        while (X != 0) {
            rem = X % 10;
            if (rem % 2 != 0) {
                add += rem;
            }
            X /= 10;
        }
    }

    printf("Result: %d\n", add);

    return 0;
}
