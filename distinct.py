x = input("Enter: ")
k = int(input("Enter: "))
def dis(x,k):
    left = 0
    ans = 0
    d = {}
    for right in range(len(x)):
        if x[right] not in d:
            d[x[right]] = 1
        else:
            d[x[right]] += 1
        while len(d) > k:
            d[x[left]] -= 1
            if d[x[left]] == 0:
                del d[x[left]]
            left += 1
        ans = max(ans, right-left+1)
    return ans
print(dis(x,k))