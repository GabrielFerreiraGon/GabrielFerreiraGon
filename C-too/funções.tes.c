#include <stdio.h> 
#include <stdlib.h> 

int funcao(int a)
{
    if(a != 0){
        printf("%d ",a);    
        return a * funcao(a - 1);
    }
    else{
        return a;
    }    
}
int fun(int n)
{
    int i,j,f;
    i = 1;f = 0;
    //enquanto j for menor ou igual a n
    for(j=0;j<=n;j++)
    {	
        f+=i;// soma o valor de i com f
        i = f - i;// i recebe f menos i
        printf("%d ",f);
    }
}

int main(void)
{
//funcao(11);
fun(20);

}
