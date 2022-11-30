#include <stdio.h>
int main() {
    int a,b,c,d;
    scanf("%d %d %d %d", &a,&b,&c,&d);
    // abc
    if(a==b && a==c) {
        printf("1");
    }
    // bcd
    else if(b==c && b==d) {
        printf("1");
    }
    // acd
    else if(a==c && a==d) {
        printf("1");
    }
    // abd
    else if(a==b && a==d) {
        printf("1");
    }
    // else
    else {
        printf("0");
    }
    return 0;
}
