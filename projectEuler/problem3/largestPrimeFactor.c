#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>


void main() {
    long x = 600851475143;
    
    long capacity = 3;

    long *factorArray = malloc(capacity * sizeof(long));

    long size = 0;

    for(long i = 1; i <= x; i++) {
        if(size >= capacity) {
            capacity *= 2;
            factorArray = realloc(factorArray, capacity * sizeof(long));
        }
        if( x % i == 0) {
            //printf("factor: %ld\n", i);
            factorArray[size] = i;
            size++;
        }
    }

    bool flag = false;

    printf("found %ld factors\n", size);

    long *primeFactors = malloc(capacity * sizeof(long));

    long numPrimes = 0;

    for(long i = 0; i < size; i++) {
        flag = false;
        for(long j = 2; j <= factorArray[i] / 2; j++) {
            if(factorArray[i] % j == 0) {
                flag = true;
            }
        }
        if(!flag) {
            primeFactors[numPrimes] = factorArray[i];
            numPrimes++;
        } else {
            printf("non prime: %ld\n", factorArray[i]);
        }
    }

    printf("%ld\n", primeFactors[numPrimes - 1]);
}
