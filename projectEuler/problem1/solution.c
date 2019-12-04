#include <stdio.h>
#include <stdlib.h>

int main() {
    int three = 3;
    int five = 5;
    int summation = 0;

    for(int x = 0; x < 1000; x++) {
        if(x % 3 == 0 || x % 5 == 0) {
            summation += x;
        }
    }
    printf("%d\n", summation);
    return 0;
}
