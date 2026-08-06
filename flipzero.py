x = list(map(int, input("Enter: ").split()))
k = int(input("Enter: "))
def flip(x,j):
    left = 0
    right = 0
    c = 0
    ans = 0
    while right < len(x):
        if x[right] == 0:
            c += 1
        right += 1
        while c > k:
            if x[left] == 0:
                c -= 1
            left += 1
        ans = max(ans, right-left)
    return ans
print(flip(x,k))