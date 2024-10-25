#include <stdio.h>
#include <math.h>

int main() {
    double x, term, sum = 0.0;
    int i;

    printf("Enter the value of x: ");
    scanf("%lf", &x);

    for (i = 1; i <= 9; i++) {
        term = pow((x - 1) / x, i) / i;  
        sum += term;  
    }
    printf("The sum of the first 9 terms of the series is: %lf\n", sum);

    return 0;
}
