#include <stdio.h>

int main(){
    int n, s=0, a, b;
    scanf("%d", &n);
    for(int i = 0; i < n; i++)
    {
            scanf("%d %d", &a, &b);
            s=b+a;
            printf("%d\n", s);
    }

    return 0;
}
