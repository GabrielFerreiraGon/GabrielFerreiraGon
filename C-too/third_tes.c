#include <stdio.h>
#include <stdlib.h>

int main(void){
int matriz[3][3]; //comencando em 0 vetor so tem linhas

for(int linha = 0; linha < 3; linha++)
{
    for(int coluna = 0; coluna < 3;coluna++){
        printf("%d,%d",matriz[linha][coluna]);
}
}
}