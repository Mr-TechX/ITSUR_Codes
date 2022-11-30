#include <stdio.h>
#include <math.h>

int main(){

   int n, k, c=0, m;

   scanf("%d %d", &n, &k);

   for(int i=1; i<=n; i++)
   {
       scanf("%d", &m);
       if(m == k)
       {
           c++;
       }

   }
   printf("%d", c );
    return 0;
}
