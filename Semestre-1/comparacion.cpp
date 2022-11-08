#include <stdio.h>
int main() {
    int a,b;
    scanf("%d %d", &a,&b);

    if(a>b) {
        printf("mayor");
    } else if(a<b) {
        printf("menor");
    } else if(a==b) {
        printf("iguales");
    }
    return 0;
}
