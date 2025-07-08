#include <stdio.h>
#include <stdlib.h>

int soma(int a,int b){
    return a + b;
}
int multi(int a,int b){
    return a * b;
}
float divisao(int a,int b){
    return a / b;
}
int main(void){
    int Rs0 = soma(23,43);
    int Rs1 = multi(23,43);
    int Rs2 = divisao(1000,20);
    int p0 = Rs0;
    int p1 = Rs1;
    int* p2 = Rs2;
    printf("\t\np0 recebe o valor de Rs0 -> %d\n",p0);
    printf("\np1 recebe o valor de Rs1 -> %d\n",p1);
    printf("\np2 is apontando para o valor dentro da variavel-> %d\n",p2);
}