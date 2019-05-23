number = 600851475143
factors = []
for x in range(1, number):
    if number % x != 0:
        factors.append(x)
