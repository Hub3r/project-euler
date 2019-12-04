def main():
    three = 3
    five = 5
    summation = 0
    for x in range(1000):
        if x % three == 0 or x % 5 == 0:
            summation += x
    print(summation)

main()
