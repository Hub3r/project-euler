def Collatz_Sequence():
    starting_value = 1000000
    longest_chain_start_value = None
    longest_chain = 0
    while starting_value != 0:
        current_value = starting_value
        current_chain = 0
        while current_value != 1:
            if current_value % 2 == 0:
                current_value = n_even_rule(current_value)
            else:
                current_value = n_odd_rule(current_value)
            current_chain += 1
        #allows accounting for the value 1 which represents end of chain
        current_chain += 1
        if current_chain > longest_chain:
            longest_chain_start_value = starting_value
            longest_chain = current_chain
        starting_value -= 1
    print(f"{longest_chain_start_value} {longest_chain}")

def n_even_rule(n):
    return n/2

def n_odd_rule(n):
    return n * 3 + 1

Collatz_Sequence()