#include <stdio.h>
int leap(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        return 1; 
    } else {
        return 0; 
    }
}
int main() {
    int day, month, year;
    int daysInMonths[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    printf("Enter day, month, year: ");
    scanf("%d %d %d", &day, &month, &year);
    if (leap(year)) {
        daysInMonths[1] = 29; 
    }
    int dayOfYear = 0;
    for (int i = 0; i < month - 1; i++) {
        dayOfYear += daysInMonths[i];
    }
    dayOfYear += day;
    printf("Day number in the year: %d\n", dayOfYear);

    return 0;
}
