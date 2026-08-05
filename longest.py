x = list(map(int, input("Enter: ").split()))
k = int(input("Enter: "))
def longest(x,k):
    left = 0
    s = 0
    m = 0
    for right in range(len(x)):
        s += x[right]
        while s > k:
            s -= x[left]
            left += 1
        m = max(m, right-left+1)
    return 