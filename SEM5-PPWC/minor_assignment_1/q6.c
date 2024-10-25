#include<stdio.h>
int main(){
    double meter;
    printf("Enter a distance in meters : ");
    scanf("%lf",&meter);
    double km=meter*0.001;
    double cm=meter*100;
    double mm=meter*1000;
    double feet=meter*3.28084;
    double inches=meter*39.3701;
    printf("unit\t\tvalue\n");
    printf("Meters\t\t%.2lf\n",meter);
    printf("Kilometers\t%.2lf\n",km);
    printf("Centieters\t%.2lf\n",cm);
    printf("Millimeters\t%.2lf\n",mm);
    printf("Feets\t\t%.2lf\n",feet);
    printf("Inches\t\t%.2lf",inches);
    return 0;
}