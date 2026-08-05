x = list(map(int, input("Enter: ").split()))
k = int(input("Enter: "))
def maxsum(x,k):
    left = 0
    right = k-1
    s = sum(x[left:right+1])
    m = s
    while right < len(x)-1:
        right += 1
        s = s - x[left] + x[right]
        m = max(m,s)
        left += 1
    return m
print(maxsum(x,k))