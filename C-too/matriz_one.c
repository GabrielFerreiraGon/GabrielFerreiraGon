#include <stdio.h>
#include <stdlib.h>
#define tam 3
using namespace
int main(void)
{

int linha,coluna;
int matriz[tam][tam];
/*for(linha=0;linha < 6;linha++)
{
printf("%d \n",linha);
}*/
for(linha=0;linha < tam;linha++)
{//este for acima é para percorrer as linhas
//esse for embaixo é para percorrer a coluna 
    for(coluna=0;coluna < tam;coluna++){
    //aqui é pra add os valores dentro de cada espaço na memoria, cada vetor 
    printf("escreva o %d numero da sua matriz:",coluna);
    scanf("%d",&matriz[linha][coluna]);
    }
}
int a = 9;
printf("%d",a);
for(linha=0;linha < tam;linha++)
{
    for(coluna=0;coluna < tam;coluna++){
    printf("%d ",matriz[linha][coluna]);
    }
    printf("\n");
}


system("pause");

}