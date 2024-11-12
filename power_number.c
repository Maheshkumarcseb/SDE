#include <stdio.h>
#include <math.h>

// Function to calculate power
double getpower(int x, int y) {
    if (y == 0)
        return 1;
    else if (y > 0)
        return pow(x, y);
    else
        return 1.0 / pow(x, -y);
}

int main() {
    int x, y;
    double ans;

    printf("Enter the value of x and y: ");
    scanf("%d %d", &x, &y);

    ans = getpower(x, y);
    printf("Power of x and y is: %lf\n", ans);

    return 0;
}
