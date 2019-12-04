def main():
    largest = 0;
    for i in range(100, 1000):
        for j in range(100, 1000):
            reversedValue = reverseNumber(i * j)
            if reversedValue == (i * j):
                if largest < reversedValue:
                    largest = reversedValue
    print(largest)
def reverseNumber(value):
    tempValue =  value
    reverse = 0
    while tempValue > 0:
        remainder = tempValue % 10
        reverse = (reverse * 10) + remainder
        tempValue = tempValue / 10
    return reverse
main()
