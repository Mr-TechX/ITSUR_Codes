#include <stdio.h>

int main(){
    int n, s=0, a;
    scanf("%d", &n);
    for(int i = 0; i < n; i++)
    {
            scanf("%d", &a);
            s=s+a;

    }
    printf("%d", s);
    return 0;
}
