// Formula general
#include <stdio.h>
#include <math.h>
int main()
{
    int a,b,c;
    double x1,x2;

    scanf("%d%d%d",&a,&b,&c);

    x1=((-1*b)+sqrt(pow(b,2)-(4*a*c)))/(2*a);

    x2=((-1*b)-sqrt(pow(b,2)-(4*a*c)))/(2*a);

    printf("%lf %lf",x1,x2);

    return 0;
}
