#include <stdio.h>
#include <stdlib.h>

int main ()
{	
	int x,y;	
	int matriz [4][4] = {};
	
/*	for ( x=0; x<4; x++ )
    for ( y=0; y<4; y++ )
    {
      printf ("\nElemento[%d][%d] = ", x, y);
      scanf ("%d", &matriz[ x ][ y ]);
    }*/
	
	for(x=0;x<4;x++){
		for(y=0;y<4;y++){
			printf("%d \t", matriz[ x ][ y ]);
		}	
    printf("\n");
	}			
	return 0;
}


