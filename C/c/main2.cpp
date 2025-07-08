#include <iostream>
#include<stdio.h>
#include <string.h>



int main()
{
    char  login[10];
    char  senha[10];
    
    printf("Entre com seu login: \n" );
    scanf("%s", login );
    printf("Digite a sua senha:\n" );
    scanf("%s", senha );

    if (strcmp(login, "aluno01")==0 && strcmp(senha, "teste01")==0){

        printf("Bem-vindo aluno\n" );
    }
    else {
        printf("Login falhou!\n");
    }
    
    return 0;
}
