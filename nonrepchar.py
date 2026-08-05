x = input("Enter: ")
def nonrep(x):
    left = 0
    ans = 0
    window = set()
    for right in range(len(x)):
        while x[right] in window:
            window.remove(x[left])
            left += 1
        window.add(x[right])
        ans = max(ans, right-left+1)
    return ans
print(nonrep(x))