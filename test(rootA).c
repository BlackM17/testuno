#include <stdio.h>
#include <stdlib.h>

int main (void){
int x=0;
printf ("HELLO WORLD");
for(;;){
	printf("This is a forever loop %d", &x);
	x++;
}
return 0;
}