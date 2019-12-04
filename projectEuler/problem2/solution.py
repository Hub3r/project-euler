def main():
    term_1 = 0
    term_2 = 1
    summation = 0
    while term_2 < 4000000:
        if term_2 % 2 == 0:
            summation += next_term
        next_term = term_1 + term_2
        term_1 = term_2
        term_2 = next_term
    print(summation)
main()
