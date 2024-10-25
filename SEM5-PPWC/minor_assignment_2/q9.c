#include <stdio.h>
int main() {
    char choice;
    printf("Enter the choice of the character: ");
    scanf("%c", &choice);
    int rows = choice - 'A' + 1;
    for (int i = 0; i < rows; i++) {
        for (char j = 'A'; j < choice - i + 1; j++) {
            printf("%c ", j);
        }
        for (int k = 0; k < 2 * i - 1; k++) {
            printf("  "); 
        }
        for (char j = choice - i; j >= 'A'; j--) {
            if (i > 0 || j != choice - i) 
                printf("%c ", j);
        }
        printf("\n");
    }

    return 0;
}
