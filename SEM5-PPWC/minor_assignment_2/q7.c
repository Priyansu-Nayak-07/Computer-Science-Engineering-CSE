#include <stdio.h>
int main() {
    int marks;
    printf("Enter the marks obtained by the student (0-100): ");
    scanf("%d", &marks);
    switch (marks / 10) { 
        case 10:
        case 9:  
            if (100<=marks<= 95)
                printf("The grade is: 'O' ");                
            break;
        case 8:  
            if ( 81<=marks<= 94)
                printf("The grade is: 'A' ");                
            break;
        case 7:  
            if ( 71<=marks<= 80)
                printf("The grade is: 'B' ");                
            break;
        case 6:  
            if ( 61<=marks<= 70)
                printf("The grade is: 'C' ");                
            break;
        case 5:  
            if ( 51<=marks<= 60)
                printf("The grade is: 'D' ");                
            break;
        case 4:  
            if ( 40<=marks<= 50)
                printf("The grade is: 'E' ");                
            break;
        default:
            if ( marks <40)
                printf("The grade is: 'F' ");
            
            else
                printf("Enter valid mark");
           break;
    }
    return 0;
}
