#include <iostream>
#include <stdio.h>

int main() 
{
	char usuario[11] , senha[11];
	char gabriel[11] ="%s Gabriel" ,teste[11] = "%s teste";
	
	printf("Usuario : \n");
	scanf("%s", &usuario);
	printf("Senha : \n");
	scanf("%s", &senha);
	
	
	if (usuario == gabriel and senha == teste){
		printf("está igual! \n");
	}
	else
	{
		printf("está errado!");
	}
	
	return 0;
}


