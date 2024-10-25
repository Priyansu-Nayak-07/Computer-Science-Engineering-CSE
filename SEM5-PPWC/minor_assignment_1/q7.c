#include<stdio.h>
int main(){
    char ch;
    double minavg;
    double curravg;
    double finalc;
    printf("Enter desired grade> ");
    scanf("%c",&ch);
    printf("Enter minimum average required> ");
    scanf("%lf",&minavg);
    printf(" Enter current average in course> ");
    scanf("%lf",&curravg);
    printf(" Enter how much the final counts \nas a percentage of the course grade> ");
    scanf("%lf",&finalc);
    finalc=finalc/100;
    double scoreneed=(minavg-(curravg*(1-finalc)))/finalc;
    printf("you need a score of %.2lf on the final to get a %c",scoreneed,ch);
    return 0;
}