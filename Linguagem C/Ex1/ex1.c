#include <stdio.h>
#include <stdlib.h>

int main ()
{		
	int num;
	printf("Digite um numero: ");
	scanf("%d", &num);
	//printf("\nO fatorial de %d e: %d", num, calculaFatorial(num));
	printf("\nO fatorial de %d e: %d", num, calculaFatorialRecursividade(num));
	
	/*	int teste;    //teste
	do
	{
		int num;
		printf("Digite um numero: ");
		scanf("%d", &num);
		printf("\nO fatorial de %d e: %d", num, calculaFatorial(num));
		printf("\n");
		printf("Deseja testar novamente? digite (1) para sim e (2) para não.");
		scanf("%d",teste);
		
	} while(teste==1);*/
	
	
	
	return 0;
}
int calculaFatorial(int num){
	int fat;
	for(fat = 1; num > 1; num = num - 1)
	{
		fat = fat*num;	
	}
	return fat;
}

int calculaFatorialRecursividade(int num){
	if (num == 1 || num == 0){
		return 1;
	}else {
		return calculaFatorialRecursividade(num-1)*num;
	}
}





