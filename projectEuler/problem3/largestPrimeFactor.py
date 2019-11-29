def main():
    number = 600851475143
    primeList = []
    x = 0
    while number != 1:
        x += 1
        if primeChecker(x) == x:
            if number % x == 0:
                primeList.append(x)
                number = number / x
                x = 0
    print(primeList)

def primeChecker(value):
    if value > 1:
        for i in range(2, value/2):
            if value % i == 0:
                return 0
        return value
    else:
        return 0

main()
