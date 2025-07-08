#include <stdio.h>
#include <stdlib.h>

multi(int a, int b){
    return a*b;
}

int main(){

int res0 = multi(3,5);
int res1 = multi(3,3);
int res2 =multi(3,6);

printf("%d\n",res0);
printf("%d\n",res1);
printf("%d\n",res2);

}