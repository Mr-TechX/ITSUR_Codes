#include <stdio.h>

int main() {
    int n, o, p, c;
    scanf("%d %d %d %d", &n, &o, &p, &c);

    int taco = 10;
    int orden = 50;
    int platon = 250;
    int canasta = 1500;
    int nt = 0;
    int no = 0;
    int np = 0;
    int nc = 0;

    while(n >= c) {
        n -= c;
        nc++;
    }
    while(n >= p) {
        n -= p;
        np++;
    }
    while(n >= o) {
        n -= o;
        no++;
    }

    nt = n;

    int ct = nt * taco + no * orden + np * platon + nc * canasta;

    printf("%d\n%d %d %d %d", ct, nt, no, np, nc);

    return 0;
}
