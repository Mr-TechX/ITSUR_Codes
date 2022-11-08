// Porcentaje en masa
#include <stdio.h>
#include <math.h>
int main()
{
    double n,k;
    double p;

    scanf("%lf%lf",&n,&k);

    p= (n/(n+k))*100;

    printf("%.2lf%% ",p);

    return 0;
}
