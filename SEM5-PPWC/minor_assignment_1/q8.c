#include<stdio.h>
int main(){
    double speedkmh,s;
    double a,t,v;
    printf("Enter the takeoff speed of the jet km/h: ");
    scanf("%lf",&speedkmh);
    printf("Enter the distance jet accelerated meters: ");
    scanf("%lf",&s);
    v = speedkmh*1000/3600;
    a = (v*v)/(2*s);
    t =  v/a;
    printf("The acceleration of the jet is %.2lf m/s².\n", a);
    printf("The time required for the jet to reach takeoff speed is %.2lf seconds.\n", t);
    return 0;
}